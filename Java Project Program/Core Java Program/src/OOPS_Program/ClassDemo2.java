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
 class Employee{
        //declaring instatnces variables
   int empid;
   String name;
   long salary;
   void setEmployee(int eid,String ename,long  esalary){
       empid=eid;
       name=ename;
       salary=esalary;
   }
   void display()
   {
       System.out.println("Employee id = "+empid);
       System.out.println("Employee name ="+name);
       System.out.println("Employee salary ="+salary);
   }
   
    }
public class ClassDemo2 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
     Employee e1=new Employee();
        e1.setEmployee(100," sachin", 26335);
        e1.display();
    }
    
}
