package part4.loops;

import java.util.Scanner;
public class Ex08CheckThePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();
        if (N < 1) {
            System.out.print("Không phải lũy thừa của 2");
            return;
        }
        while (N % 2 == 0) {
            N /= 2;
        }
        if (N == 1) {
            System.out.println("Đây là lũy thừa của 2");
        } else {
            System.out.println("Không phải lũy thừa của 2");
        }
    }
}
