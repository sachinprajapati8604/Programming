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
//sOLING OF LINEAR EQUATION BY CRAMAR RULE METHOD
public class CramerRule {

    /**
     * @param args the command line arguments
     */
    public static void D(int a,int b,int c,int d,int e,int f){
        double D1= (a*e-b*d);
        double Dx=(c*e-b*f);
        double Dy=(a*f-c*d);
        double X=Dx/D1;
        double Y=Dy/D1;
        System.out.println("Your Equation is as : ");
        System.out.println(a+"x" +"+"+b+"y" +"+"+c+ "="+"0"+"------------(1)");
        System.out.println(d+"x" +"+"+e+"y" +"+"+f+ "="+"0"+"------------(2)");  
        System.out.println("Value of X : " +X);
        System.out.println("Va;ue of Y : "+Y);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
                int a,b,c,d,e,f;
                System.out.println("Enter value of a,b,c of first quation as a then b then c");
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                System.out.println("Enter a,b,c of second Equation");
                d=sc.nextInt();
                e=sc.nextInt();
                f=sc.nextInt();
                D(a, b, c, d, e, f);
    }
    
}
