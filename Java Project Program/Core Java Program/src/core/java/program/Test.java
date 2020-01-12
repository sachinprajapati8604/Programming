/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core.java.program;

import java.util.Scanner;
import  java.util.regex.*;

/**
 *
 * @author Sachin Prajapati
 */
public class Test {
    public static boolean isValid(String mob)
    {
          Pattern p =Pattern.compile("(0/91)?[7-9][0-9]{9}");
            Matcher m=p.matcher(mob);
            return (m.find() && m.group().equals(mob));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
       
       String mob;
      
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mobile Number");
        mob=sc.nextLine();
       if(isValid(mob))
       {
           System.out.println("Valid ");
       }else{
           System.out.println("Invalid");
       }
         
    }
    
}
  