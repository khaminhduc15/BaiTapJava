import java.util.Scanner;

public class Bai4 {
//    Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, max;
        System.out.println("Nhap 3 so nguyen a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if( a == b & b == c){
            System.out.println("3 so bang nhau. Gia tri lon nhat la "+a);
            System.exit(0);
        }
        if (a >= b){
            max = a;
        }
        else {
            max = b;
        }
        if (c >= max){
            max = c;
        }
        System.out.println("Gia tri lon nhat la: "+max);
    }
}
