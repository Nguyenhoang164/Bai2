import java.util.Scanner;

class Kiemtra {

    public static void main(String[] args) {
        int n = 20;
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        if (n >= 1) {
            System.out.println(n + " Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for (int i = 2; i < 20; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}