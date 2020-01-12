/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Gapful Number is number ,atleast 3 digit number ,which is divisible by to form of first and last digit of number...i.e   192 have first digit 1 and last digit 2 ,hence it is divisble by 12.
package core.java.program;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class GapfulNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int num=sc.nextInt();
        int d1,d2;
        d1=num%10;   
        d2=num/100;
        int count=1;
        while(count<=d2)
            count *=10;
       int comb =d2*count+d1;   //combining of both integer
       // System.out.println(comb);
        if(num%comb==0)
            System.out.println("Its a Gapful Number");    //Hint like 192,583.  
        else
            System.out.println("Its not a gapful number ");
    }
    
}
 class Gapful2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter atleast 3 digit number");
        int num=sc.nextInt();
        String x=String.valueOf(num);  
       int  digit=Integer.parseInt(x.charAt(0)+""+x.charAt(x.length()-1));
        System.out.println(digit);
         if(num%digit==0)
            System.out.println("Its a Gapful Number");    //Hint like 192,583.
        else
            System.out.println("Its not a gapful number ");
        
    }
}
