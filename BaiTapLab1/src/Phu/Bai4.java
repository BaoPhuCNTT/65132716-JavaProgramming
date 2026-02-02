package Phu;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Nhập các hệ số của phương trình bậc 2 (ax^2 + bx + c = 0) ---");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        
        double delta = Math.pow(b, 2) - 4 * a * c;

 
        double canDelta = Math.sqrt(delta);

        System.out.printf("Delta = %.2f\n", delta);
        System.out.printf("Căn Delta = %.2f\n", canDelta);

        scanner.close();
    }
}