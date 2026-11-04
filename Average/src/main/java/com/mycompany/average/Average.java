/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.average;

import java.util.Scanner;

/**
 *
 * @author ACC
 */
public class Average {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number-1:");
        int a=sc.nextInt();
        System.out.println("Enter the number-2:");
        int b=sc.nextInt();
        System.out.println("Enter ther number-3:");
        int c=sc.nextInt();
        int average=(a+b+c)/3;
        System.out.println("Average area is"+average);
    }
}

