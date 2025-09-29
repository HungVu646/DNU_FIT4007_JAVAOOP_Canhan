package part4.loops;

import java.util.Scanner;
public class Ex09PrintFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();
        long giaiThua = 1;
        for (int i = 1; i <= N; i++) {
            giaiThua *= i;
        }
        System.out.println(N + "! = " + giaiThua);
    }
}
