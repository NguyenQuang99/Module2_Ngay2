package Thuchanh_Ungdungtienlaichovay;

import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        System.out.println("Nhap so tien gui");
        money = sc.nextDouble();
        System.out.println("Nhap so thang gui");
        month = sc.nextInt();
        System.out.println("Nhap so thang cho vay");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for(int i =0; i< month; i++) {
            total_interset += money * (interset_rate/100)/12 * month;
        }
        System.out.println("So tien lai" + total_interset);

    }
}
