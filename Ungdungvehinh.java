package Hien_thi_hinh;

import java.util.Scanner;

public class figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);int choice = -1;
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter the choice");
        choice = sc.nextInt();
        {

            System.out.println("Print the rectangle");

            for(int i = 1; i<= 7; i++) {
                for (int j = 1; j <= 3; j ++) {
                    System.out.printf("*");
                }
                System.out.printf("\n");
                break;


            }


        }
        // in ra tam giac vuong

        for (int i = 1; i<=5; i++) {
            for (int j = 1;j <i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        // in hinh tam giac can
        int h;
        System.out.println("Nhap chieu cao");
        h = sc.nextInt();
        for(int i= 1; i<= h;i++) {
            for (int j =1;j < 2 * h;j++) {
                if(Math.abs(h - j) <= (i -1) ) {
                    System.out.printf("*");
                } else  {
                    System.out.printf(" ");
                }

            }
            System.out.printf("\n");
        }




    }
}
