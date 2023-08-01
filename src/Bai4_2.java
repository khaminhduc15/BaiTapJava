import java.util.Scanner;

public class Bai4_2 {
//Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Nhap 2 canh hinh chu nhat :");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Dien tich hinh chu nhat la: " + (a * b));
    }
}
