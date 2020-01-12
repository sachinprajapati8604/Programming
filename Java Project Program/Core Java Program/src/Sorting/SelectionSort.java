/*12
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
public class SelectionSort {
void sort(int a[])
{
    int i,j,temp;
    int n=a.length;
    for( i=0;i<n-1;i++){
        int minI=i;
        for( j=i+1;j<n;j++)
            if(a[j]<a[minI])
                minI=j;
        //Swapping of numbers
         temp=a[minI];
        a[minI]=a[i];
        a[i]=temp;
        
    }
}

    //Printing the Array
void printarray(int a[])
{  int n,i;
    n=a.length;
    for(i=0;i<n;++i)
        System.out.println(a[i]+"\t");
   // System.out.println();
}
    public static void main(String[] args) {
        // TODO code application logic here
     SelectionSort b=new SelectionSort();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Length of Array");
       int  num=sc.nextInt();
       int a1[] = new int[num];
        System.out.println("Enter Array You want sort : \t" );
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=sc.nextInt();
        }
       
       // int a[]={2,1,5,0,8,9,4};
        // System.out.println("Sorted Array is \t"); x
         b.sort(a1);
          System.out.println("Sorted Array is ");
          b.printarray(a1);
          
    }
    
}
