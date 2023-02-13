import java.util.Scanner;

public class timuocchung {
    public static void main(String[] args) {
        System.out.println("nhập a :");
        Scanner sca = new Scanner(System.in);
        int a, b;
        a = sca.nextInt();
        System.out.println("nhập b :");
        Scanner scb = new Scanner(System.in);
        b = scb.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0){
            System.out.println("Không có kết quả ");
        } else {
            while (a != b){
                if(a>b){
                    a = a - b ;
                } else {
                    b = b - a ;
                }
                System.out.println("ước chung lớn nhất là"  + a );
            }
        }

    }
}
