/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//EXAPMLE OF SINGLE INHERITENCE 
package OOPS_Program;

/**
 *
 * @author Sachin Prajapati
 */
class Rundog{
    void bark(){
        System.out.println("Sheru.......");
        System.out.println("Bho.....bho.....");
    }
}
class Bulldog extends Rundog{
    void grawl(){
        System.out.println("Tuffy...");
        System.out.println("Gurr...gurr...");
    }
}
public class InheritenceDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bulldog bd=new Bulldog();
        bd.bark();
        bd.grawl();
    }
    
}
