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
interface  Interface1
{
    void m1();
    void m2();
    void m3();
}
abstract  class test1 implements Interface1
{
    public  void m1(){
        System.out.println("This message from m1");
    }
}
abstract  class test2 extends test1
{
    public  void m2(){
        System.out.println("This message from m2");   
    }
}
public class interfacedemo2  extends test2{
public void m3(){
    System.out.println("This message from m3");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        interfacedemo2 dm=new interfacedemo2();
        dm.m1();
        dm.m2();
        dm.m3();
    }
    
}
