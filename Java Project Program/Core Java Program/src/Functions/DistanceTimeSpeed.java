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
public class DistanceTimeSpeed {

    /**
     * @param args the command line arguments
     */
    public void  Speed(double d,double t)
    {
       double s=d/t;
        System.out.println("Value of Speed : "+s +" m/sec^2");
    }
       public void  Distance(double s,double t)
    {
       double d=s*t;
        System.out.println("Value of Speed : "+d +" m");
    }
          public void  Time(double d,double s)
    {
       double t=d/s;
        System.out.println("Value of Speed : "+s+" sec");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        DistanceTimeSpeed dst=new DistanceTimeSpeed();
        Scanner sc=new Scanner(System.in);
        double speed,dist,time;
        int ch;
        System.out.println("Press 1 to calculate speed \n Press 2 to calculate Distance \n Press 3 to calculate Time ");
        ch=sc.nextInt();
        switch(ch)
                {
            case 1:
                System.out.println("Enter Value of Distance and Time in meter and second");
                dist=sc.nextDouble();
                time=sc.nextDouble();
                dst.Speed(dist, time);
                break;
            case 2:
                System.out.println("Enter Value of Speed and Time in SI units");
                speed=sc.nextDouble();
                time=sc.nextDouble();
                dst.Distance(speed, time);
                break;
            case 3:
                System.out.println("Enter Value of Distance and Speed in SI units");
                dist=sc.nextDouble();
                speed=sc.nextDouble();
                dst.Time(dist, speed);
                break;
        }
    }
    
}
