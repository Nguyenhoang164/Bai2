import javax.sound.midi.SysexMessage;
import java.util.Scanner;
//public class hienthihinh {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.printf("*");
//            }
//            System.out.println("");
//        }
//    }


//    class hinhchunhat {
//        public static void main(String[] args) {
//            for (int x = 0; x <= 3; x++) {
//                for (int y = 0; y < 7; y++) {
//                    System.out.printf("* ");
//                }
//                System.out.println(" ");
//            }
//        }
//    }

//    class hinhtamgiac {
//        public static void main(String[] args) {
//            for (int t = 0; t <= 5; t++) {
//                for (int h = 5; h > t; h--) {
//                    System.out.printf("* ");
//                }
//                System.out.println("");
//            }
//        }
//    }

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight, k = 0;
        System.out.printf("Nhập vào chiều cao của kim tự tháp: ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; i++, k = 0) {
            for (int space = 1; space <= hight - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}


