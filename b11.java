import java.util.Scanner;
public class b11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sau khi hoán đổi:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
