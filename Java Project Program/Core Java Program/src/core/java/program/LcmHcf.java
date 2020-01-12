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
public class LcmHcf {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0,i,max,min,lcm=1,gcd=1;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number for lcm or hcf ");
        int n1=sc.nextInt();
        System.out.print( " Enter " +n1 +" Numbers : ");
       int a[] = new int[n1];
       // System.out.println("Enter elements of array:");
        for( i = 0; i < n1; i++)   //first for loop to store the numbers
        {
            a[i] = sc.nextInt();
        }
        max = a[0];
        min=a[0];
        for( i = 0; i < n1; i++)   //second for loop to check the value is max or min
        {
            if(max < a[i])
            {
                max = a[i];
            }
            if(min>a[i])
            {
                min=a[i]; 
            }
            
        }   //ending of 1st for loop
    /*   for(int k=0;k<a.length;k++){
                int x=k*max;
                if(x%min==0){
                    lcm=x;
                }
            } */
    
        System.out.println("Maximum value:"+max);
        System.out.println("Minimum value:"+min);
         System.out.println("Lcm Of given Numbers:"+lcm);
    }
    
}
