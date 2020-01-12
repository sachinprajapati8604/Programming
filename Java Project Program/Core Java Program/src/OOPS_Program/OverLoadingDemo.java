/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPS_Program;

/**
 *
 * @author Sachin Prajapati
 */
class A{
    void m1(){
        System.out.println("m1 of A");
    }
    void m2(){
        System.out.println("m2 of A");
    }
}
class B{
    void m2(){
        System.out.println("m2 of B"); 
    }
    void  m3(){
        System.out.println("m3 of B");
    }
    void m4(){
        System.out.println("m4 of B");
    }
}
public class OverLoadingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a1=new A();
        a1.m1();
        a1.m2();
        B b1=new B();
        b1.m2();
        b1.m3();
        b1.m4();
    }
    
}
