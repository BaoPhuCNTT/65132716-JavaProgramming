package Phu;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        
        System.out.println("--- Kết quả hình chữ nhật ---");
        System.out.printf("Chu vi: %.2f\n", chuVi);
        System.out.printf("Diện tích: %.2f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f\n", canhNho);

        scanner.close();
    }
}