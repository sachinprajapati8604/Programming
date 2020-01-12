/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core.java.program;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */
public class PrimeFactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number");
        int n=sc.nextInt();
        //logic to print prime factor
        System.out.print("Prime Factor : ");
            for(i=2;i<n;i++){
         
                while(n%i==0){
                  
                   n=n/i;
            System.out.print(i+"\t"); 
                
                }
            }
            if(n>2){
                System.out.println(n);
            }
        }
    }
    

