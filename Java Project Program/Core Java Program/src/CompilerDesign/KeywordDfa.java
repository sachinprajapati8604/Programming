/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Program to recognise the keyword of C language .
package CompilerDesign;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class KeywordDfa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a keyword of C language");
        String str=sc.nextLine();
        if(str.equals("auto") || str.equals("break")|| str.equals("case") || str.equals("char") || str.equals("const") || str.equals("continue") || str.equals("default") || str.equals("do") || str.equals("double") 
                || str.equals("else") || str.equals("enum") || str.equals("extern") || str.equals("float") || str.equals("for") || str.equals("goto") || str.equals("if") || str.equals("int") || str.equals("long")
                || str.equals("register") || str.equals("return") || str.equals("short") || str.equals("signed") || str.equals("sizeof") || str.equals("static") || str.equals("struct") || str.equals("switch")
                || str.equals("typedef") || str.equals("union") || str.equals("unsigned") || str.equals("void")|| str.equals("volatile") || str.equals("while"))
        {
            System.out.println("This is keyword");
        }
        else{
            System.out.println("Its not a keyword ");
        }
    }
    
}
