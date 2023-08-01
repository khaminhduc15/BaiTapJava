import java.util.Scanner;

public class Bai2_2 {
//    Chuyển từ mét sang feet: ft =m * 3.2808
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double met;
    System.out.println("Nhap so met :");
    met = sc.nextDouble();
    System.out.println((met * 3.2808) + " ft");
}
}
