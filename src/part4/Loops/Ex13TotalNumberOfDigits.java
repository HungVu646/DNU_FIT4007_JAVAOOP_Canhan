package part4.loops;

import java.util.Scanner;
public class Ex13TotalNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên N: ");
        int N = sc.nextInt();
        int tong = 0;
        int tmp = N;
        while (tmp > 0) {
            tong += tmp % 10;
            tmp /= 10;
        }
        System.out.println("Tổng các chữ số của " + N + " là: " + tong);
    }
}
