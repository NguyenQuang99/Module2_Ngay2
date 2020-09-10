package Check_SNT;

import javax.swing.*;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so can kiem tra");
        int number = sc.nextInt();
        boolean check = true;
        if(number < 2) {
            System.out.println("Khong phai so nguyen to");
        } else {

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if(check) {
            System.out.println("La so nguyen to");
        } else {
            System.out.println("Khong la so nguyen to");
        }
    }
}
