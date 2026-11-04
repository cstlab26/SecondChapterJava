/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multipy;

import java.util.Scanner;

/**
 *
 * @author ACC
 */
public class Multipy {

    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number-1:");
        int a=sc.nextInt();
        System.out.println("Enter the number-2:");
        int b=sc.nextInt();
        int multipy=a*b;
        System.out.println("the ans is"+multipy);
    }
}

  
