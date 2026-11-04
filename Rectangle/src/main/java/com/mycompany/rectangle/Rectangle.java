/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

import java.util.Scanner;

/**
 *
 * @author ACC
 */
public class Rectangle {

    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number-1:");
        int a=sc.nextInt();
        System.out.println("Enter the number-2:");
        int b=sc.nextInt();
        int area=a*b;
        System.out.println("the ans is"+area);
    }
}

