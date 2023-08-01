import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so a va b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (b == 0){
            System.out.println("Nhap b khac 0!");
        }
        else if(a%b == 0){
            System.out.println("a chia het cho b");
        }
        else {
            System.out.println("a khong chia het cho b");
        }
    }
}