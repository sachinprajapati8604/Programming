/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PackagesInJava;
import PackagesInJava.Mypack.calci.;
import java.util.Scanner;
/**
 *
 * @author Sachin Prajapati
 */
public class Calci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calci c =new calci();
        double a,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        a=sc.nextDouble();
        b=sc.nextDouble();
        sum=c.add(a,b);
    }
    
}
