/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// matching of two string
package core.java.program;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class EqualStringProof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str1,str2;
        System.out.println("Enter First String ");
        str1=sc.nextLine();
        System.out.println("Enter second String ");
        str2=sc.nextLine();
        if(str1.equals(str2))
            System.out.println("Bothe String are  Equal");
        else
        {
            System.out.println("Both string are not equal");
        }
    }
    
}
