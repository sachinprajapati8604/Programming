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
public class SumGreatest {

    /**
     * @param args the command line arguments
     */
    static double  add(double a,double b){ 
        return (a+ b);
    }
    double greatest(double a,double b){
        return (a>b?a:b);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        SumGreatest s=new SumGreatest();
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        double x,y,sum,great;
        x=sc.nextDouble();
        y=sc.nextDouble();
        sum=add(x,y);
        great =s.greatest(x,y);
        System.out.println("Sum is :"+sum);
        System.out.println("Greatest number is :"+great);
      
        
    }
    
}
