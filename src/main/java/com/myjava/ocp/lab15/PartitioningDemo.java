package com.myjava.ocp.lab15;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import static java.util.stream.Collectors.partitioningBy;

public class PartitioningDemo {
    public static void main(String[] args) {
        String[] ids = {"A111111111", "B222222222", "C211111111", "D122222222"};
        System.out.println(
            Stream.of(ids).collect(partitioningBy(id -> id.charAt(1) == '1'))
        );
        Map<Boolean, List<String>> map1 = Stream.of(ids).collect(partitioningBy(id -> id.charAt(1) == '1'));
        System.out.println(map1);
    }
}
