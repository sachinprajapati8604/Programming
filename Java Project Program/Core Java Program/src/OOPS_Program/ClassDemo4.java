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
class Students{
    int rollnum,sem,year;
    String name,college,branch;
    void setStudents(int rollnum,String name,int sem,int year,String branch,String college){
    this.rollnum=rollnum;
    this.name=name;
    this.sem=sem;
    this.year=year;
    this.branch=branch;
    this.college=college;
}
    void display(){
        System.out.println("RollNumber of Student :"+rollnum);
        System.out.println("Name of Student :"+name);
        System.out.println("Semester :"+sem);
        System.out.println("Year :"+year);
        System.out.println("Branch :"+branch);
        System.out.println("College :"+college);
    }
}
public class ClassDemo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Students st=new Students();
        int rn,sm,yr;
        String nm,br,coll;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rollnumber :");
        rn=sc.nextInt();
        System.out.print("Enter Name :");
        nm=sc.nextLine();
        System.out.print("Enter Semester :");
        sm=sc.nextInt();
                
        System.out.print("Enter Year :");
        yr=sc.nextInt();
        System.out.print("Enter Branch :");
        br=sc.nextLine();
        System.out.print("Enter College Name :");
        coll=sc.nextLine();
        st.setStudents(rn, nm, sm, yr, br, coll);
        st.display();
    }
    
}
