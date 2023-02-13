import java.util.Scanner;

public class tinhsotienlai {
    public static void main(String[] args) {
        double Sotien ;
        int Thang = 1 ;
        double Sotienlai ;
        Scanner input = new Scanner(System.in);
        System.out.println(" nhập số tiền mà bạn muốn vay : ");
        Sotien = input.nextDouble();
        System.out.println("nhập số tháng mà bạn muốn vay vốn :");
        Thang = input.nextInt();
        System.out.println("Nhập lãi suất :");
        Sotienlai = input.nextDouble();
        double Sotienno = 0 ;
        for (int i = 0 ; i < Thang ; i ++){
            Sotienno = Sotien * (Sotienlai/100)/12 * Thang ;
        }
         System.out.println(" số tiền bạn phải trả là " + Sotienno);
    }
}
