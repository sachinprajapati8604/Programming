/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// PRINTING EVEN NUMBER  OF SERIES
package core.java.program;
import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class EvenSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int i=1;
while(i<=100)
{
if(i%2==0)
{
System.out.print(i+"\t");
}
i++;
}
}
}