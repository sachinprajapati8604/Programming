/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Functions;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class Trignometry {

    /**
     * @param args the command line arguments
     */
    public static void Trigno(double num){
        double n=Math.toRadians(num);
        System.out.println("Value of sin : "+Math.sin(n));
         System.out.println("Value of cos : "+Math.cos(n));
          System.out.println("Value of tan : "+Math.tan(n));
           System.out.println("Value of cosine : "+Math.sin(1/n));
            System.out.println("Value of sec : "+Math.cos(1/n));
             System.out.println("Value of cot : "+Math.sin(1/n));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter value in degree");
        double num=new Scanner(System.in).nextDouble();
        Trigno(num);
        
    }
    
}
