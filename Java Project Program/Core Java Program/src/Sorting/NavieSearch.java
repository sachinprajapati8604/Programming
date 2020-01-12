/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//THIS PROGRAM IS BASED ON STRING MATCHING PATTERN OF NAVIE ALGORTHIM 
package Sorting;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */ 
public class NavieSearch { 
  
    public static void Search(String txt, String pat) 
    { 
        int N = txt.length(); 
        int M = pat.length(); 
      
        for (int i=0;i<=N-M;i++) { 
  
            int j; 
  
            for (j=0;j<M;j++) 
                if (txt.charAt(i+j) != pat.charAt(j)) 
                    break; 
  
            if (j==M) 
                System.out.println("Pattern found at index " + i); 
             
        } 
    } 
  
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        NavieSearch ns=new NavieSearch();
        String txt,match;
        System.out.println("Enter a String ");
        txt=sc.nextLine();
        System.out.println("Enter a pattern to be matched");
        match=sc.nextLine();
        ns.Search(txt,match);
    } 
} 