package part4.loops;

import java.util.Scanner;
public class Ex15CalculateTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= N; i++) {
            tong += i * (i + 1);
        }
        System.out.println("Tổng = " + tong);
    }
}
