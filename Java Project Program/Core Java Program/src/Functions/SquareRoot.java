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
public class SquareRoot {

    /**
     * @param args the command line arguments
     *///declaring function for square 
    public void sqr(double num){
      double   s=num*num;
      // or    double p=Math.pow(num, 2);
        System.out.println("Square of "+num +" :" +s);
    }
    public void sqrt(double num){
        double st=Math.sqrt(num);
        System.out.println("Square root of " +num +" :" +st);
    }
    public void Cube(double num){
        double cube=Math.pow(num, 3);
        System.out.println("Cube of "+num+" :"+cube);
    }
    public void CubeRoot(double num){
        double cr=Math.cbrt(num);
        System.out.println("Cube root of "+num+" :"+cr);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc=new Scanner(System.in);
        SquareRoot sr=new SquareRoot();
        System.out.println("Enter a number");
        double n=sc.nextDouble();
        sr.sqr(n);
        sr.sqrt(n);
        sr.Cube(n);
        sr.CubeRoot(n);
      
        
    }
    
}
