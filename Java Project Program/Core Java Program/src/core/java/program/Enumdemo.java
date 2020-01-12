/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core.java.program;

/**
 *
 * @author Sachin Prajapati
 */
public class Enumdemo {

    /**
     * @param args the command line arguments
     */
    enum  Name{Mon,Tue,Wed,Thu,Fri,Sat,Sun};
    public static void main(String[] args) {
        // TODO code application logic here
       
        Name n1=Name.Fri;
        
        System.out.println(n1);
    }
    
}
