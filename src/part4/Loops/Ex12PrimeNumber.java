package part4.loops;

import java.util.Scanner;
public class Ex12PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên N: ");
        int N = sc.nextInt();
        boolean nguyenTo = true;
        if (N <= 1) {
            nguyenTo = false;
        }
        else {
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    nguyenTo = false;
                    break;
                }
            }
        }

        if (nguyenTo) {
            System.out.println(N + " là số nguyên tố");
        } else {
            System.out.println(N + " không phải là số nguyên tố");
        }
    }
}
