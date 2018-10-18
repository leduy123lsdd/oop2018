package week5_6.testList;

import java.util.ArrayList;
import java.util.List;

public class testList {

    private static List<A> test = new ArrayList<>();

    public static void main(String[] args) {
        test.add(new A(2));
        test.add(new A(3));
        test.add(new A(4));
        test.add(new A(5));


        for(A a : test){
            System.out.println(a.getX());
        }
        System.out.println( "Size is: " + test.size());
        System.out.println();
    }
}
