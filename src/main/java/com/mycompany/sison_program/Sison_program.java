/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sison_program;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class Sison_program {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Basic output Syntax
        System.out.println("Hello World!");
        System.out.println("Kelvin Sison!");
        System.out.println("Act 2D");
        //comment// 
        System.out.println("Enter a number 1");
        int x = input.nextInt();
        System.out.println("Enter a number 2");
        int y = input.nextInt();
        
        int sum,diff,multi,div;    
        sum = x + y;
        diff = x - y;
        multi = x * y ;
        div = x / y;
        System.out.println("sum is:"+sum);
         System.out.println("diff is:"+diff); 
        System.out.println("multi is:"+multi); 
        System.out.println("div is:"+div); 
        System.out.println("div is:"+div); 
    }
}
