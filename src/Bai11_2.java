import java.util.Scanner;

public class Bai11_2 {
//    Viết chương trình tính thuế thu nhập cá nhân.
// 1	TN <= 5tr	    TN x 5%
//2	5tr < TN <= 10tr	TN x 10% - 0.25tr
//3	10tr < TN <= 18tr	TN x 15% - 0.75tr
//4	18tr < TN <= 32tr	TN x 20% - 1.65tr
//5	32tr < TN <= 52tr	TN x 25% - 3.25tr
//6	52tr < TN <= 80tr	TN x 30% - 5.85tr
//7	TN > 80tr	TN x 35% - 9.85tr
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double thunhap;
        System.out.println("Thu nhap ca nhan cua ban (trieu dong): ");
        thunhap = sc.nextDouble();
        if(thunhap <= 5){
            System.out.println("Thue ban can phai dong la: " +(thunhap * 5 /100) + " trieu dong");
        }
        if(thunhap > 5 && thunhap <= 10){
            System.out.println("Thue ban can phai dong la: " +(thunhap *10 /100 - 0.25) + " trieu dong");
        }
        if(thunhap > 10 && thunhap <= 18){
            System.out.println("Thue ban can phai dong la: " +(thunhap *15 /100 - 0.75) + " trieu dong");
        }
        if(thunhap > 18 && thunhap <= 32){
            System.out.println("Thue ban can phai dong la: " +(thunhap *20 /100 - 1.65) + " trieu dong");
        }
        if(thunhap > 32 && thunhap <= 52){
            System.out.println("Thue ban can phai dong la: " +(thunhap *25 /100 - 3.25) + " trieu dong");
        }
        if(thunhap > 52 && thunhap <= 80){
            System.out.println("Thue ban can phai dong la: " +(thunhap *30 /100 - 5.85) + " trieu dong");
        }
        if(thunhap > 80){
            System.out.println("Thue ban can phai dong la: " +(thunhap *35 /100 - 9.85) + " trieu dong");
        }
    }
}
