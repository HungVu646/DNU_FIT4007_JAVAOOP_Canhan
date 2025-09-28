package part4.loops;

import java.util.Scanner;
public class Ex03PrintDecreasingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên N: ");
        int N = sc.nextInt();
        for (int i = N ; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
