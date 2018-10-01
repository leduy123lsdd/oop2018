package week3;

import org.junit.Test;

import java.beans.Transient;

import static org.junit.Assert.*;


public class Week3Test {
    @Test
    // TODO: Viết 5 testcase cho phương thức max()
    public void max() {
       Week3 test1 = new Week3();
       assertEquals(3,test1.max(2,3));
       assertEquals(23,test1.max(1,23));
       assertEquals(123,test1.max(67,123));
       assertEquals(1,test1.max(1,0));
       assertEquals(90,test1.max(90,12));
    }

    @Test
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void minOfArray() {
        Week3 test2 = new Week3();
        int[] array1 = {1,5,3,7,6};
        int[] array2 = {5,512,342,57,16};
        int[] array3 = {-111,5,323,73,6234};
        int[] array4 = {0,1,2,3,4,5};
        int[] array5 = {123,90,1,56};
        assertEquals(1,test2.minOfArray(array1));
        assertEquals(5,test2.minOfArray(array2));
        assertEquals(-111,test2.minOfArray(array3));
        assertEquals(0,test2.minOfArray(array4));
        assertEquals(1,test2.minOfArray(array5));
    }

    @Test
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void calculateBMI() {
        Week3 test3 = new Week3();
        assertEquals("Thừa cân",test3.calculateBMI(60.00,1.60));
        assertEquals("Bình thường",test3.calculateBMI(56.00,1.62));
        assertEquals("Béo phì",test3.calculateBMI(60.00,1.50));
        assertEquals("Thiếu cân",test3.calculateBMI(48.03,1.70));
        assertEquals("Bình thường",test3.calculateBMI(34.76,1.23));
    }
}
