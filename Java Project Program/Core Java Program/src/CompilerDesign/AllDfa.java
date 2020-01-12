/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//THOS DFA PROGRAM ACCEPTED ALL THE STRING .
package CompilerDesign;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class AllDfa {

    /**
     * @param args the command line arguments
     */
  public static void Check(String s){
      int flag=0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='0' || s.charAt(i)=='1'){
              flag++;
          }else{
              System.out.println("Please Enter  a string of 0 and 1");
              break;
          }
      } if(flag==s.length()){
          System.out.println("String Accepted");
      }else{
          System.out.println("String Rejected");
      }
  }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("NOTE:-->>This program accept all the string which contains 0,1");
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter A string ");
        str=sc.nextLine();
        Check(str);
        
    }
    
}
