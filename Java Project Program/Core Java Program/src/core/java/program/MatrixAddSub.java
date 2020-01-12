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
public class MatrixAddSub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int i,j,l,r=0,c=0;
       
        System.out.println("Enter row and column of  matrix");
        r=sc.nextInt();
        c=sc.nextInt();
         int a[][]=new int[r][c];
        int b[][]=new int [r][c];
        int sum[][]=new int [r][c];
        int sub[][]=new int [r][c];
        System.out.println("Enter first matrix");
        for(i=0;i<a.length;i++)
            for(j=0;j<b.length;j++)
        a[i][j]=sc.nextInt();
        
         System.out.println("Enter second matrix");
        for(i=0;i<a.length;i++)
            for(j=0;j<b.length;j++)
        b[i][j]=sc.nextInt();
        
        // code to sum of martix
        for(i=0;i<a.length;i++)
            for(j=0;j<a.length;j++)
        sum[i][j]=a[i][j]+b[i][j];
        
        // code to subtraction of martix
        for(i=0;i<a.length;i++)
            for(j=0;j<b.length;j++)
        sub[i][j]=a[i][j]-b[i][j];
        
        //printing the sum of matrix
         System.out.println("\n"+"Sum of matrix");
        for(i=0;i<a.length;i++)
            for(j=0;j<b.length;j++)
                System.out.print(sum[i][j]+"\t");
        
                //printing the substraction of matrix
         System.out.println("Subtraction  of matrix");
        for(i=0;i<a.length;i++)
            for(j=0;j<b.length;j++)
        
        System.out.print(sub[i][j]+"\t");
        
    }
    
}
