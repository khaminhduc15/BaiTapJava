import java.util.Scanner;

public class Bai3_2 {
//    Tính diện tích hình vuông khi biết cạnh a.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Nhap canh hinh vuong :");
        a = sc.nextDouble();
        System.out.println("Dien tich hinh vuong la: " + (a * a));
    }
}
