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
public class UgliNumber {

    /**
     * @param args the command line arguments
     */
    public static void Check(int n){
       
       if(n%2==0 && n%3==0 && n%5==0)
       {
           System.out.println("Number is Ugli");
       }else
            System.out.println("Number is not ugli");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        Check(num);
    }
    
}
