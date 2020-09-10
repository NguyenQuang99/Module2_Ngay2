package SNT_nho_hon100;

import java.util.Scanner;

public class display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap number");
        number = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon number la");
        for(int i = 2;i<= number; i++) {
            if(isPrimeNumber(i) ) {
                System.out.printf("%3d",i);
            }
        }


    }

    public static boolean isPrimeNumber(int n) {
        boolean check = true;
        if (n < 2) {
            check = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}