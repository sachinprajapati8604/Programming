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
public class AreaByFunction {

    /**
     * @param args the command line arguments
     */
  
static int area(int l,int b)
{
return(l*b);
}
public static void main(String bu[])
{
     
int x,y,a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length,width");
x=sc.nextInt();
y=sc.nextInt();
   a= area(x, y); //calling of static  function
System.out.println("Area is:"+a);
    System.out.println("Do you want to find Volume ? \n Enter lenght, width,height");
    Double p,q,r,v;
    p=sc.nextDouble();
    q=sc.nextDouble();
    r=sc.nextDouble();
  
   v=new AreaByFunction().volume(p,q,r);    //caling of non static function
    System.out.println("Volume is :" +v);
}
Double volume(Double l,Double b, Double h)
{
    return (l*b*h);
}
}

