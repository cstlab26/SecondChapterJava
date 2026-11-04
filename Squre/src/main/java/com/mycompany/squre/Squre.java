/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.squre;

import java.util.Scanner;

/**
 *
 * @author ACC
 */
public class Squre {

    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length:");
        int a=sc.nextInt();
        double area=a*a;
        System.out.println("the ans is"+area);
    }
}

