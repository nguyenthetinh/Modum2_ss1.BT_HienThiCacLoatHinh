package com.HienThiCacLoatHinh;
import java.util.Scanner;
public class HienThi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square reiangle bottom left");
        System.out.println("3. Print the square reiangle top left");
        System.out.println("4. Print isosceles reiangle");
        System.out.println("0. Exit");
        int so=scanner.nextInt();
        while (so!=0){
            switch (so) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*" + " ");
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(" ");
                        for (int j = 1; j < i; j++) {
                            System.out.print("*" + " ");
                        }
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        System.out.println(" ");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*" + " ");
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < 9; i++) {
                        System.out.println(" ");
                        for (int j = 0;j<19;j++){
                            if (j<10-i | j>(10-i)+2*i) System.out.print(" ");
                            else System.out.print("*");
                        }
                    }
                    break;
            }
            so=scanner.nextInt();

        }
    }
}
