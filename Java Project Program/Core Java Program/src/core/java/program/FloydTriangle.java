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
public class FloydTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
       
        int r,i,j,fnum=1;
        System.out.println("Enter Number of Rows");
        r=sc.nextInt();
        System.out.println("******Printing*****");
        for(i=0;i<=r ;i++){
            for(j=0;j<i;j++)
            {
                 System.out.print(fnum+" ");  
               fnum ++;
            }
             System.out.println();
    }
        System.out.println("****Revere Of Floyd Triangle***** ");
        int frev=r*(r+1)/2;
        for(i=r;i>=1;i--){
            for(j=i;j>=1;j--){
                System.out.print(frev+" ");
                --frev;
            }
            System.out.println();
        }
    }
}
