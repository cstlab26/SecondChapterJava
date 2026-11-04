/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.daytomonth;

import java.util.Scanner;

/**
 *
 * @author ACC
 */
public class DayToMonth {

    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
        System.out.println("Enter day-");
        int day=sc.nextInt();
        int month=day/30;
        int newDay=day-(month*30);
        
        System.out.println(day+"day is equal to"+month+"month and "+newDay+"day");
    }
}


