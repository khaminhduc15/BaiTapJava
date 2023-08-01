import java.util.Scanner;

public class Bai8_2 {
//    Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuoi;
        System.out.println("Nhap so tuoi: ");
        tuoi = sc.nextInt();
        if(tuoi < 120 && tuoi > 0){
            System.out.println("Day la so tuoi cua 1 nguoi");
        }
        else {
            System.out.println("Day khong phai la so tuoi cua 1 nguoi");
        }
    }
}
