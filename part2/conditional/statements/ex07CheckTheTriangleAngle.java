package part2.conditional.statements;

import java.util.Scanner;
public class ex07CheckTheTriangleAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập góc a: ");
        int a=sc.nextInt();
        System.out.print("Nhập góc b: ");
        int b=sc.nextInt();
        System.out.print("Nhập góc c: ");
        int c=sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && (a + b + c == 180)) {
            System.out.println("Ba góc " + a + ", " + b + ", " + c + " là một tam giác");
        } else {
            System.out.println("Ba góc " + a + ", " + b + ", " + c + " không phải là tam giác");
        }
    }
}
