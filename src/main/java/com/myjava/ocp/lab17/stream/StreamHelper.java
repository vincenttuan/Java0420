package com.myjava.ocp.lab17.stream;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
 
public final class StreamHelper {
    public static class Record {
        private final Map<String, Object> fields = new HashMap<>(16);
        private final long count;
 
        private Record(final ResultSet resultSet) throws SQLException {
            final ResultSetMetaData metaData = resultSet.getMetaData();
            count = metaData.getColumnCount();
            for (int i = 1; i <= count; ++i) {
                fields.put(metaData.getColumnName(i), resultSet.getObject(i));
            }
        }
 
        /**
         * Is there a column named like this?
         *
         * @param columnName is the column name in the query.
         * @return True if found.
         */
        public boolean contains(final String columnName) {
            return fields.containsKey(columnName);
        }
 
        /**
         * Number of columns.
         *
         * @return Numer of columns.
         */
        public long count() {
            return count;
        }
 
        /**
         * Get value casted to the requested type.
         * <p>
         * No type checking happens inside. It is your job to know the datatype in the database.
         * <p>
         * Example:
 
         * {@code record.get("COLUMN1", Long.class); // returns a Long}
         *
         * @param columnName is the column name in the query.
         * @param type is Java type of the column.
         * @return The value casted to the Java type.
         */
        public <T> T get(final String columnName, final Class<T> type) {
            return type.cast(getObject(columnName));
        }
 
        /**
         * Get columns in the record.
         *
         * @return Collection of the column names.
         */
        public Set<String> getColumns() {
            return Collections.unmodifiableSet(fields.keySet());
        }
 
        /**
         * Get value as an object.
         *
         * @param columnName is the column name in the query.
         * @return The value.
         */
        public Object getObject(final String columnName) {
            return fields.get(columnName);
        }
 
        /**
         * Get value as string.
         *
         * @param columnName is the column name in the query.
         * @return Value as string.
         */
        public String getString(final String columnName) {
            return Objects.toString(fields.get(columnName));
        }
 
        /**
         * Is the given cell null?
         *
         * @param columnName is the column name in the query.
         * @return True if null.
         */
        public boolean isNull(final String columnName) {
            return getObject(columnName) == null;
        }
 
        @Override
        public String toString() {
            return fields.entrySet().stream().map(e -> e.getKey() + ": " + e.getValue())
                    .collect(Collectors.joining(", "));
        }
    }
 
    /**
     * Wrap a ResultSet in a Stream.
     * <p>
     * The wrapper consumes the result set. The caller must close the result set after the stream
     * processing was finished.
     *
     * @param resultSet is the open result set to streamline.
     * @return A stream of rows.
     */
    public static Stream<Record> stream(final ResultSet resultSet) {
        // "est = Long.MAX_VALUE if infinite, unknown, or too expensive to compute."
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<Record>(Long.MAX_VALUE,
                Spliterator.NONNULL | Spliterator.IMMUTABLE) {
            @Override
            public boolean tryAdvance(final Consumer<? super Record> action) {
                try {
                    if (!resultSet.next()) {
                        return false;
                    }
                } catch (@SuppressWarnings("unused") final SQLException e) {
                    return false;
                }
                try {
                    action.accept(new Record(resultSet));
                } catch (@SuppressWarnings("unused") final SQLException e) {
                    return false;
                }
                return true;
            }
        }, true).parallel();
    }
 
    private StreamHelper() { /* Hidden. */ }
}
