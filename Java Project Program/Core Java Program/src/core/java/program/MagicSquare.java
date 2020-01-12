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
public class MagicSquare {

    /**
     * @param args the command line arguments
     */
public static void display(int r,int c ){
    r=c;
    int a[][]=new int[r][c];
    r=a.length;
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int r,c=0,j=0,i;
        r=c;
        System.out.println("Hello Please open the Function package of Core Java Program Thank you !");
        System.out.println("Enter Length of Square");
        r=sc.nextInt();
        System.out.println("Enter "+r*r+" numbers");
        int a[][]=new int[r][r];
         i=j;
        for(i=0;i<a.length;i++) 
            for(j=0;j<a.length;j++)
        a[i][j]=sc.nextInt();
        System.out.println(a[1][1]);
         int sum[][]=new int [r][c];
       //calculating sum
       int ld=0;
        for(i=0;i<a.length;i++)
            for(j=0;j<a[i].length;j++)
        ld=a[i][j];
        System.out.println("Ld is :");
         for(i=0;i<r;i++)
            for(j=0;j<r;j++)
                System.out.println(ld);
         
    }
    
    
}
