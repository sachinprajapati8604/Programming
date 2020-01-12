/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOPS_Program;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
class Student{
    int rollnum,sem;
    String name,collName;
    void setStudent(int rollnum,int sem,String name ,String collName){
        this.rollnum=rollnum;
        this.sem=sem;
        this.name=name;
        this.collName=collName;
    }
    void display(){
        System.out.println("Student Roll number :"+rollnum);
        System.out.println("Student Name :"+name);
        System.out.println("Student Semester :"+sem);
        System.out.println("Student College Name :"+collName);
    }
    
}
public class ClassDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Student st=new Student();
       Student st2=new Student();
      
       st.setStudent(40, 5, "Sachin Prajapati", "BU JHANSI");
       st.setStudent(47, 5, "Sheru", "BU JHANSI");
     
        st.display();
        st2.display();
        
    }
    
 
}