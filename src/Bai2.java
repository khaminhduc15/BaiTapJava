import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
//        Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhap so tuoi cua ban: ");
        a = sc.nextInt();
        if (a < 16){
            System.out.println("Ban " + a + " tuoi. Ban chua du dieu kien hoc lop 10");
        }
    }
}
