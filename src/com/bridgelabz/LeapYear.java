package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    static int Example=100;
    public static void main(String[] args) {
        System.out.print("Enter Year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        m2(year);
    }

    static void m2(int year) {
        if (year % 100 == 0 && year % 4 == 0 || year % 100 != 0 && year % 4 == 0){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("year is not leap year");
        }
        System.out.println(Example);
    }
}
