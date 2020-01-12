/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LoginForm;

/**
 *
 * @author Sachin Prajapati
 */
import java.util.*;
public class demobank 
{
 String deponame;
 long accnum;
 String acctype;
 double bal;
 void setValue(String deponame,long accnum,String acctype,double bal)
 {
 this.deponame=deponame;
 this.accnum=accnum;
 this.acctype=acctype;
 this.bal=bal;
 
 }
 void deposit(int amount)
 {
     bal=bal+amount;
     System.out.println("The amount is debited");
 }
 void withdraw(int amount)
 {
     if(bal>=amount)
     {
         bal=bal-amount;
         System.out.println("Amount is credited");
     }
     else
     {
         System.out.println("Unsufficient balance");
         
     }
 }
     void display()
     {
         System.out.println("Account Holder name :"+deponame);
         System.out.println("Amount in Account :"+bal);
     }
     
    public static void main(String bu[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account holder name :");
        String deponame=sc.nextLine();
        System.out.print("Enter Account type :");
        String acctype=sc.nextLine();
        System.out.print("Enter account number :");
        long accnum=sc.nextLong();
        System.out.println("Enter opening balance amount");
        int bal=sc.nextInt();
        
        demobank b=new demobank();
        b.setValue(deponame,accnum,acctype,bal);
        System.out.println("Congratulation ! Your account is created");
        int ch,amt;
        do
        {
            System.out.println("press 1 for deposit \n press 2for withdraw \n press 3 for display \n press 4 for exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter amount to deposit");
                    amt=sc.nextInt();
                    b.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter Amount to withdraw ");
                    amt=sc.nextInt();
                    b.withdraw(amt);
                    break;
                case 3:
                    b.display();
                    break;
                case 4:
                    break;
                default :
                    System.out.println("Invslid Choice");
              break;
                    
            }
            
        }
        while(ch!=4);
        
    }
 
}
