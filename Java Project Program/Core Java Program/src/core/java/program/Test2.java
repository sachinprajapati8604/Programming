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
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void test1(){
       Scanner sc=new Scanner(System.in);
        int num;
         System.out.println("Enter Number ");
        try {
              num=sc.nextInt();
              System.out.println("You have enterd "+num);
        } catch (Exception e) {
            System.out.println("Enter only integer");
        }  
    }
    public static void test2(){
        int n1, n2;
        float sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        n1=sc.nextInt();
        n2=sc.nextInt();
        sum=(n1+n2);
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args) {
        // TODO code application logic here
       
       //test1();
      test2();
    }
    
}
