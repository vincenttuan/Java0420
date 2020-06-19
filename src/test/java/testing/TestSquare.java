package testing;

import com.myjava.ocp.lab16.Square;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class TestSquare {
    @Test
    public void test() {
        int x = 10;
        int y = 20;
        int h = 4;
        int exp = 60; // 期望的結果
        Square sq = new Square();
        int act = sq.getArea(x, y, h); // 實際產出的值
        
        assertEquals(exp, act);
    }
}
