package week2.task2;

import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính

    private int numerator = 0;
    private int denominator = 0;

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumerator(int a) {
        this.numerator = a;
    }

    public void setDenominator(int b) {
        this.denominator = b;
    }

    public void minimalFraction() {
        // Toi gian phan so
        int gcd = Task1.gcd(this.getNumerator(),this.getDenominator());
        this.setNumerator(this.getNumerator()/gcd);
        this.setDenominator(this.getDenominator()/gcd);
    }

    public Fraction(){}

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

        int num = this.getNumerator() * other.getDenominator() + this.getDenominator() * other.getNumerator();
        int deno = this.getDenominator()*other.getDenominator();

        Fraction newFraction = new Fraction(num,deno);
        newFraction.minimalFraction();;
        System.out.println("Sum is: " + newFraction.getNumerator() + "/" + newFraction.getDenominator());

        return newFraction;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int num = this.getNumerator() * other.getDenominator() - this.getDenominator() * other.getNumerator();
        int deno = this.getDenominator()*other.getDenominator();

        Fraction newFraction = new Fraction(num,deno);
        newFraction.minimalFraction();;
        System.out.println("Subtract is : " + newFraction.getNumerator() + "/" + newFraction.getDenominator());
        return newFraction;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới

        int num = this.getNumerator() * other.getNumerator();
        int deno = this.getDenominator() * other.getDenominator();

        Fraction newFraction = new Fraction(num,deno);
        newFraction.minimalFraction();

        System.out.println("Multiply is : " + newFraction.getNumerator() + "/" + newFraction.getDenominator());

        return newFraction;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int num = this.getNumerator() * other.getDenominator();
        int deno = this.getDenominator() * other.getNumerator();

        Fraction newFraction = new Fraction(num,deno);
        newFraction.minimalFraction();

        System.out.println("Divide is : " + newFraction.getNumerator() + "/" + newFraction.getDenominator());
        return newFraction;
    }

    public Boolean equals(Fraction other) {
        this.minimalFraction();
        other.minimalFraction();
        Boolean result = false;
        if(this.numerator == other.numerator && this.denominator == other.denominator) {
            result = true;
        }
        System.out.print("is it equals ? : " + result + "\n");
        return result;
    }

    public static void main(String[] args) {
        Fraction Fraction1 = new Fraction(-3,4);
        Fraction Fraction2 = new Fraction(1,4);

        Fraction1.add(Fraction2);
        Fraction1.multiply(Fraction2);
        Fraction1.subtract(Fraction2);
        Fraction1.divide(Fraction2);
        Fraction1.equals(Fraction2);

    }

}
