/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rhombus;

import java.util.Scanner;

/**
 *
 * @author ACC
 */
public class Rhombus {

    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number-1:");
        int d1=sc.nextInt();
        System.out.println("Enter the number-2:");
        int d2=sc.nextInt();
        double area =(0.5*(d1*d2));
        System.out.println("the ans is"+area);
    }
}
