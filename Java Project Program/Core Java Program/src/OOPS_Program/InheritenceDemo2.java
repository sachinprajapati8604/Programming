/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//HEIRACHICAL INHERITENCE
package OOPS_Program;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
class Shape{
    int s;
    void setSide(int side)
    {
        s= side;
    }
}
class square extends Shape{
    int area(){
        return (s*s);
    }
}
class cube extends Shape{
    int volume(){
        return (s*s*s);
    }
}
 
public class InheritenceDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        // TODO code application logic here
        int side;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of square");
        side=sc.nextInt();
        square sq= new square();
        sq.setSide(side);
        int a=sq.area();
        System.out.println("Area of the square :"+a);
        System.out.println("Enter side of cube");
        side=sc.nextInt();
        cube cb=new cube();
        cb.setSide(side);
        int v = cb.volume();
        System.out.println("Volume of the Cube :"+v);
    }
    
}
