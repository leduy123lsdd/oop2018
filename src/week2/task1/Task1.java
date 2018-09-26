package week2.task1;

import week2.task2.Fraction;

public class Task1 {

    public Task1(){}

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a<0) { a=a*(-1); }
        if(b<0) { b=b*(-1); }
        if( a < b) {
            int temp = 0;
            temp = a;
            a = b;
            b = temp;
        }
        return b == 0 ? a : gcd(b,a%b);
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        int a0 = 0;
        int a1 = 1;

        int result = 0;
        int index = 2;

        if(n == 0) return a0;
        if(n == 1) return a1;

        while (index <= n) {
            result = a1 + a0;
            index++;
            a0 = a1;
            a1 = result;
        }
            return result;
    }
    public static void main(String[] args) {
        //GCD
        int a = gcd(3 ,0);
        System.out.print("Gcd: " + a + "\n");

        //Fibonaci
        int n = 3;
        int fibonaci = fibonacci(n);
        System.out.print("The fibonaci number in position " + n + " is: "+ fibonaci + "\n");

        // Calculate fractions
        Fraction Fraction1 = new Fraction(1,4);
        Fraction Fraction2 = new Fraction(1,4);

        Fraction1.add(Fraction2);
        Fraction1.multiply(Fraction2);
        Fraction1.subtract(Fraction2);
        Fraction1.divide(Fraction2);
        Fraction1.equals(Fraction2);


    }

}
