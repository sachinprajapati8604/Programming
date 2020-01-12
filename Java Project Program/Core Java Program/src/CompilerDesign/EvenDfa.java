/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//DFA PROGRAM TO ACCEPTING A STRING OF EVEN LENGTH.
package CompilerDesign;


import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class EvenDfa {

    /**
     * @param args the command line arguments
     */
  
public static void main(String arg[])
{ 
 Scanner sp=new Scanner(System.in);
    String str;int flag=0;
    System.out.println("Enter String as 0/1");
    str=sp.nextLine();
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='0'||str.charAt(i)=='1')
        {
          if(str.length()%2==0){
          flag++;    
        }
          }
        else{
            System.err.println(" Enter number only as 0 or 1");
            break;
        }
        
    }
    if(flag==str.length())
    System.out.println("String is accepted");
    else{
        System.out.println("String rejected");
    }
 } 
}