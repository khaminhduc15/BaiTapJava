import java.util.Scanner;

public class Bai3 {
//    Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhap so nguyen a: ");
        a = sc.nextInt();
        if(a > 0){
            System.out.println("a > 0");
        }
        else if(a == 0){
            System.out.println("a = 0");
        }
        else {
            System.out.println("a < 0");
        }
    }
}
