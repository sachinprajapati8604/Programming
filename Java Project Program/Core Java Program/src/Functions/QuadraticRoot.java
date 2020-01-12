/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Sachin Prajapati
 */
public class QuadraticRoot {

    /**
     * @param args the command line arguments
     */
    public void D(double a,double b,double  c){
       double d=b*b-4*a*c;
      double r1=(-b+Math.sqrt(d))/2*a;
      double r2=(-b-Math.sqrt(d))/2*a;
        if (d==0) {
            System.out.println("Value of Discriminant (D) : "+d +" \n  Roots is real and equals ");
            System.out.println("Roots of given qudratic equation is : "+r1 +" and " +r2);
        }
        else if (d<0) {
            System.out.println("Value of Discriminant (D): "+d +"\n  Roots are imaginary and unequal");
             System.out.println("Roots of given qudratic equation is : "+r1 +" and " +r2);
        }else{
            System.out.println( "Value of Discriminant (D) : "+d +"\n Roots are real and unequal");
             System.out.println("Roots of given qudratic equation is : "+r1  +" and " +r2);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        QuadraticRoot qr=new QuadraticRoot();
        double a,b,c;
        System.out.print("Enter coefficient of x^2 ,x and constant value : ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        qr.D(a, b, c);
        
        
        
    }
    
}
