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
public class NestedIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number below 10 :");
        int num=sc.nextInt();
        if(num<10){
            System.out.println("First if Executed");
            if(num<10){
                System.out.println("Second if executed");
            }if(num<10){
                System.out.println("Third if executed");
            }
            
        }else{
                System.out.println("Wrong entered");
            }
    }
    
}
