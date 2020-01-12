/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class SortByArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n;
        
        System.out.println("Enter length of array");
        n=sc.nextInt();
        System.out.println("Enter "+n+" array element");
        int a[] =new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        System.out.println("Sorted Array is :");
        for(int i=0;i<a.length;i++)
            
        System.out.print(a[i] +"\t");
        
    }
    
}
