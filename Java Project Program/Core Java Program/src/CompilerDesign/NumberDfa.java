/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CompilerDesign;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class NumberDfa {

    /**
     * @param args the command line arguments
     */
    //THIS PROGRAM ONLY ACCEPT NUMBERS
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter a string (numbers)");
        String str=sc.nextLine();
      
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='0' || str.charAt(i)=='1' ||str.charAt(i)=='2'|| str.charAt(i)=='3'|| str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7'||str.charAt(i)=='8'|| str.charAt(i)=='9'){
            flag++;
            }
        } if(flag==str.length()){
            System.out.println("String Accepted");
        }else{
            System.out.println("String Rejectd");
        }
    }
}  
   
