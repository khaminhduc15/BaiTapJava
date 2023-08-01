import java.util.Scanner;

public class Bai6_2 {
//    Giải phương trình bậc 1. ax + b=0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Nhap 2 so a va b: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if(a == 0 & b !=0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else{
            System.out.println("Phuong trinh co nghiem la: " +(-b/a));
        }
    }
}
