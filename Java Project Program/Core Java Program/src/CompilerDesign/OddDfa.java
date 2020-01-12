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
public class OddDfa {

    /**
     * @param args the command line arguments
     */
    static void Check(String s){
        int flag=0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='0' || s.charAt(i)=='1'){
              if(s.length()%2!=0){
              flag++;
              }
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
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter A String of 0 and 1");
        String str=sc.nextLine();
        Check(str);
    }
    
}
