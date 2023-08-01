import java.util.Scanner;

public class Bai1_2 {
//    Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doC;
        System.out.println("Nhap do C :");
        doC = sc.nextDouble();
        System.out.println((doC * 9 / 5 + 32) + "°F");
    }
}
