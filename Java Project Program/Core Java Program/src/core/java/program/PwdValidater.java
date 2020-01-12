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
public class PwdValidater {

    /**
     * @param s
     * @param args the command line arguments
     * @return 
     */
    public static boolean isValid(String s)
    {
        if(s.length()<5 || s.length()>10 || s.contains(" ")){
            return false;
        }
        if(s.matches(".*[^A-Za-z0-9].*")&& s.matches(".*[0-9].*"))
            return true;
        else {
            //System.out.println("Please enter 5 to 10 letters ");
            return false;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter Strong Password");
        str=sc.nextLine();
        if(isValid(str)){
            System.out.println("Yes,Its a Strong Password");
        }else{
            System.out.println("Not a Strong password");
        }
    }
    
}
