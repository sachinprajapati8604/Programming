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
public class UseOfReplace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String sen,fw,rw;
        System.out.println("Enter Any Sentence");
        sen=sc.nextLine();
        System.out.println("What to you want to replace");
        fw=sc.nextLine();
        System.out.println("Write Your New word");
        rw=sc.nextLine();
        System.out.println("Modified Sentence : " +(sen.replace(fw,rw )));
        
    }
    
}
