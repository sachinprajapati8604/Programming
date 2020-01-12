/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core.java.program;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class Array {
    public static void main(String bu[]){
        int x[]=new int[5];
        int i,sum=0,avg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Five number");
        for(i=0;i<x.length;i++)
        {
             x[i]=sc.nextInt();
             sum=sum+x[i];
             avg=sum+x[i]/5;
        }
        System.out.println("Summation of Number is :"+sum);
        System.out.println("Average of Numbers is :"+avg);
        
        
    }
    
}
class WhileLoop{
    public static void main(String bu[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for Addition ");
        
    }
}
