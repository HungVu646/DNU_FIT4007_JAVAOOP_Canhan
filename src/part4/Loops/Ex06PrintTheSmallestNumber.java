package part4.loops;

import java.util.Scanner;
public class Ex06PrintTheSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương S: ");
        int S = sc.nextInt();
        int tong = 0, N = 0;
        while (tong + (N + 1) <= S) {
            N++;
            tong += N;
        }
        System.out.println("Số nguyên dương N nhỏ nhất thỏa mãn là: " + N);
    }
}
