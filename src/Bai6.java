import java.util.Scanner;

public class Bai6 {
//    Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng. VD: 5%
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double doanhso;
    System.out.println("Nhap doanh so: ");
    doanhso = sc.nextDouble();
    System.out.println("Tien hoa hong nhan duoc la: " +(doanhso * 5 / 100));
}
}
