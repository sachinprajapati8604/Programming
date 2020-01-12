/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//emirp means a number which is prime number and its reverse is alsio is prine number 
package core.java.program;

import java.util.Scanner;

/**
 *
 * @author Sachin Prajapati
 */public class EmirpDemo { 
     //method to declare Reverse of a number
  static int Reverse(int n)
  {
      int digit,rev=0;
      while(n!=0)
        
      {
          digit=n%10;
          rev=rev*10+digit;
          n=n/10;
      }
      System.out.println(rev);{
      return 0;}
  }
  //method to cheack nummber is prime or not
  public static boolean prime(int n){
      if(n<=1){
          return  false;
      } else{
      for(int i=2;i<n;i++)
          if (n%i==0) {
              return false;
              
          }
      return true;
      }
     
      
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc=new Scanner(System.in);
       // EmirpDemo ed=new EmirpDemo();
        System.out.println("Enter Number ");
        n=sc.nextInt();
     int rev =Reverse(n);  //calling static function
        if(prime(n)){
            System.out.println("Given number is Emirp");
        }else{
            System.out.println("Given number is not Emirp");
        }
       
    }
    
}
