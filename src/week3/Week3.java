package week3;

import org.junit.runner.JUnitCore;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất

        return m > n ? m : n;
    }
    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min = array[0];
        for(int i = 1;i < array.length;i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = (weight / (height*height));
        String result = "";

        if(BMI < 18.50) result = "Thiếu cân";
        else if(BMI >= 18.50 && BMI <= 22.99) result = "Bình thường";
        else if(BMI >= 23.00 && BMI <= 24.99) result = "Thừa cân";
        else if(BMI >= 25.00) result = "Béo phì";

        return result;
    }

    public static void main(String[] args) {
        System.out.print(calculateBMI(60.00,1.60));
        System.out.print(calculateBMI(56.00,1.62));
        System.out.print(calculateBMI(60.00,1.50));
        System.out.print(calculateBMI(48.03,1.70));
        System.out.print(calculateBMI(34.76,1.23));

    }
}
