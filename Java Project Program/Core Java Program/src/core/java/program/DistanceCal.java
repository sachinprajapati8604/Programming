/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Distance claculatorusing two points
package core.java.program;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class DistanceCal {

    /**
     * @param args the command line arguments
     */
    void Dist(int a,int b ,int c ,int d){
       double dis=Math.sqrt(Math.pow((a-b),2)+Math.pow((c-d),2));
        System.out.println("Distance is : "+dis);
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        DistanceCal dc=new DistanceCal();
        int x1,x2,y1,y2;
        System.out.println("Enter value of x1 and y1");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("Enter the value of x2 and y2 ");
        x2=sc.nextInt();
        y2=sc.nextInt();
        dc.Dist(x1, x2, y1, y2);
    }
    
}
