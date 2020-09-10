package TimUCLN;

import java.util.Scanner;

public class general {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhap so a");
        a = sc.nextInt();
        System.out.println("Nhap so b");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b == 0) {
            System.out.println("khong co gia tri");
        }
        while (a != b ) {
            if(a > b) {
                a = a -b;
            } else {
                b = b -a;
            }
        }
        System.out.println("UCLN cua a, b la" + a);
    }
}
