import java.util.Scanner;

public class Bai5_2 {
//    Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Nhap 2 canh goc vuong :");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Dien tich hinh tam giac la: " + (a * b / 2));
    }
}
