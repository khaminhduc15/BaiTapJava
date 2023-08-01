import java.util.Scanner;

public class Bai7 {
//    Tính cước điện thoại cho một hộ gia đình với các thông số đã cho. VD: 1300d/1p
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double phut;
    System.out.println("Nhap so phut goi: ");
    phut = sc.nextDouble();
    System.out.println("Cuoc dien thoai cua gia dinh la: " +(phut * 1300) + " Nghin Dong");
}
}
