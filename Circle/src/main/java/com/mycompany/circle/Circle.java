/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circle;

import java.util.Scanner;

/**
 *
 * @author ACC
 */
public class Circle {

    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
        System.out.println("Enter the radius:");
        int r=sc.nextInt();
        double area=Math.PI*r*r;
        System.out.println("the ans is"+area);
    }
}

