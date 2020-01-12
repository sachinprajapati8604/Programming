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
public class MagicSquare {

    /**
     * @param args the command line arguments
     */
     
     int R1(int n[][]){
       int i,j;
     int  sum =0;
       i=0;
       for(j=0;j<3;j++){
        sum=sum+n[i][j];
     }System.out.println("Sum of First row  :"+sum);
       return sum;
    }
    int R2(int n[][]){
       int i,j, sum =0;
       i=1;
       for(j=0;j<3;j++){
          sum=sum+n[i][j];
     }
       System.out.println("Sum of second row :"+sum);
       return sum;
   }
 int  R3(int n[][]){
        int i,j,sum=0;
        i=2;
        for(j=0;j<3;j++){
            sum=sum+n[i][j];
        }
        System.out.println("Sum of third row :"+sum);
        return sum;
    }
 int C1(int n[][]){
        int i,j,sum=0;
        j=0;
        for(i=0;i<3;i++){
            sum=sum+n[i][j];
        }
        System.out.println("Sum of First Column :"+sum);
         return sum;
    }
 int  C2(int n[][]){
        int i,j,sum=0;
        j=1;
        for(i=0;i<3;i++){
            sum=sum+n[i][j];
        }
        System.out.println("Sum of second Column :"+sum);
          return sum;
        }
   int C3(int n[][]){
        int i,j,sum=0;
        j=2;
        for(i=0;i<3;i++){
            sum=sum+n[i][j];
        }
        System.out.println("Sum of Third Column :"+sum);
      return sum;
   }
    int D1(int n[][]){
        int i,j,sum=0;
       for(i=0;i<3;i++)
           for (j=0;j<3;j++){
               if (i==j) {
                 sum=sum+n[i][j];  
               }
            
      }
        System.out.println("Sum of First Diagonal :"+sum);
    return sum;
    }
     int D2(int n[][]){
        int i,j,sum=0;
        i=0;j=2;
        int s1=n[i][j];
        i=1;j=1;
        int s2=n[i][j];
        i=2;j=0;
        int s3=n[i][j];
        sum=s1+s2+s3;
         System.out.println("Sum of second Diagonal :"+sum);
    return sum;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        MagicSquare ms=new MagicSquare();
        int i,j;
        int num[][]=new int[3][3];
        System.out.println("Enter 9 number");   
        /*                    Enter 9 number
           Magic square Numbers :                 2 7 6 9 5 1 4 3 8                    */
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                num[i][j]=sc.nextInt();
        int a= ms.R1(num);
        int b=ms.R2(num);
        int c=ms.R3(num);
        int d=ms.C1(num);
        int e =ms.C2(num);
        int f= ms.C3(num);
        int g= ms.D1(num);
        int h=ms.D2(num);
        
        if (a==b && b==c && c==d && d==e && e==f && f==g && g==h) {
            System.out.println("\n");
            System.out.println("Hip hip Hurrah! It's a Magic Square ");
            System.out.println("Thank for Playing Code of magic square");
        }
        else{
            System.out.println("Given square is Not a Magic square Try again ,Better luck next time ");
        }
           
    }
    
}
 