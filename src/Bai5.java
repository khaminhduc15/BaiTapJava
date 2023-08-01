import java.util.Scanner;

public class Bai5 {
//    Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double dtb;
        System.out.println("Nhap diem bai kiem tra: ");
        a = sc.nextInt();
        a = check(a);
        System.out.println("Nhap diem thi giua ki: ");
        b = sc.nextInt();
        b = check(b);
        System.out.println("Nhap diem thi cuoi ki: ");
        c = sc.nextInt();
        c = check(c);
        dtb = 0.1 * a + 0.3 * b + 0.6 * c;
        if(dtb >= 8){
            System.out.println("Ban dat hoc luc Gioi");
        }
        if(dtb >= 6.5 && dtb < 8){
            System.out.println("Ban dat hoc luc Kha");
        }
        if(dtb >= 5 && dtb < 6.5){
            System.out.println("Ban dat hoc luc Trung Binh");
        }
        if(dtb < 5 && dtb >= 3){
            System.out.println("Ban dat hoc luc Yeu");
        }
        if(dtb < 3){
            System.out.println("Ban dat hoc luc Kem");
        }
    }
    public static int check(int a){
        Scanner sc = new Scanner(System.in);
        if(a > 10 || a < 0){
            System.out.println("Vui long nhap dung so diem: ");
            a = sc.nextInt();
            check(a);
        }
        return a;
    }
}
