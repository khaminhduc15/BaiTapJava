import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai7_2 {
//     Giải phương trình bậc 2. ax^2+bx+c = 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;
        System.out.println("Nhap 3 so a b c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = b*b - 4*a*c;
        if(a == 0 && b == 0 && c == 0){
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else if(delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem duy nhat la: " +(-b/(2*a)));
        }
        else{
            System.out.println("Phuong trinh co 2 nghiem la : " + ((-b + sqrt(delta)) / (2 * a)) + " va " + ((-b - sqrt(delta)) / (2 * a)));
        }
    }
}
