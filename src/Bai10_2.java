import java.util.Scanner;

public class Bai10_2 {
//    Viết chương trình tính giá điện
//    Bậc 1: 0 - 50 kWh (1.678 đồng/ kWh). Thành tiền: 83.900 đồng.
//Bậc 2: 50 - 100 kWh ( 1.734 đồng/ kWh). Thành tiền: 86.700 đồng.
//Bậc 3: 100 - 200 kWh (2.014 đồng/ kWh). Thành tiền: 201.400 đồng.
//Bậc 4: 200 - 300 kWh (2.536 đồng/ kWh). Thành tiền: 253.600 đồng.
//Bậc 5: 300 - 400 kWh (2.834 đồng/ kWh). Thành tiền: 283.400 đồng.
//Bậc 6: 400 - 500 kWh (2.927 đồng/ kWh). Thành tiền: 292.700 đồng.
//    Tiền điện bậc X = Giá điện bậc X x Số điện tiêu thụ bậc X
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Nhap so dien tieu thu (kWh): ");
        a = sc.nextDouble();
        if (a>0 && a<=50){
            System.out.println("Tien dien can nop cua thang nay la: " + (a * 1678) + " Nghin Dong");
        }
        if (a>50 && a<=100){
            System.out.println("Tien dien can nop cua thang nay la: " + (83900 + (100-a)*1734) + " Nghin Dong");
        }
        if (a>100 && a<=200){
            System.out.println("Tien dien can nop cua thang nay la: " + (83900 + 86700 + (200-a)*2014) + " Nghin Dong");
        }
        if (a>200 && a<=300){
            System.out.println("Tien dien can nop cua thang nay la: " + (83900 + 86700 + 201400 +  (300-a)*2536) + " Nghin Dong");
        }
        if (a>300 && a<=400){
            System.out.println("Tien dien can nop cua thang nay la: " + (83900 + 86700 + 201400 + 253.600 +  (400-a)*2834) + " Nghin Dong");
        }
        if (a>400 && a<=500){
            System.out.println("Tien dien can nop cua thang nay la: " + (83900 + 86700 + 201400 + 253.600 + 283.400 +  (500-a)*2927) + " Nghin Dong");
        }
    }
}
