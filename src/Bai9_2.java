import java.util.Scanner;

public class Bai9_2 {
//    Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
//a,b,c > 0
//a + b > c
//b + c > a
//a + c > b
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhap 3 so nguyen a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if(a <= 0 || b <= 0 || c <= 0){
            System.out.println("Day khong phai la 3 canh cua 1 tam giac");
        } else if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Day la 3 canh cua 1 tam giac");
        }
        else {
            System.out.println("Day khong phai la 3 canh cua 1 tam giac");
        }
    }
}
