package Hien_thi_SNT;

import java.util.Scanner;

public class display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap vao 1  so");
        number = sc.nextInt();
        int count = 0;
        int n = 0;

        while (count < number) {
            if (isPrimeNumber(n)) {
                System.out.printf("%d ",n);
                count++;
            }
            n++;
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
