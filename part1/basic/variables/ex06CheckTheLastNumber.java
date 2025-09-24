package part1.basic.variables;

import java.util.Scanner;
public class ex06CheckTheLastNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên N: ");
        int a = sc.nextInt();
        int b = a % 10;
        int N = Math.abs(b);
        System.out.println("Chữ số cuối cùng của số đó là: " + N);
    }
}
