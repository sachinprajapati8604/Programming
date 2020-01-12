/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorting;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class BubbleSort {
    int bubblesort(int a[])
    {
        int i,j,temp;
        int n=a.length;
        for(i=0;i<n-1;i++)
            for(j=0;j<n-i-1;j++)
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
        return 0;
    }
    //method for printing sorted array
    public int printarr(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"\t");
        return 0;
    }
    public static void main(String bu[])
    {
        BubbleSort b=new BubbleSort();
        Scanner sc=new Scanner(System.in);
  
        int a1[] = new int[4];
        System.out.println("Enter Array You want sort : " );
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=sc.nextInt();
        }
       
       // int a[]={2,1,5,0,8,9,4};
        // System.out.println("Sorted Array is \t");
         b.bubblesort(a1);
          System.out.println("Sorted Array is");
         b.printarr(a1);
        
         
    }
    
}
