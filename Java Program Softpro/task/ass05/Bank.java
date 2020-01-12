import java.util.Scanner;
class Bank
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
System.out.println("The amount is credited");
}
void withdraw(int amount)
{
if(bal>=amount)
{
bal=bal-amount;
System.out.println("Amount is debited");
}
else 
{
System.out.println("Unsufficient balance");
}
}
void display()
{
System.out.println("Account Holder name :"+deponame);
System.out.println("Ammount in Acccount :"+bal);
}



public static void main(String bu[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter account holder name :");
String deponame =sc.nextLine();
System.out.println("Enter account type :");
String acctype=sc.nextLine();
System.out.println(" Enter account number :");
int accnum=sc.nextInt();
System.out.println("Enter opening balance account :");
int bal =sc.nextInt();



Bank b=new Bank();
b.setValue(deponame,accnum,acctype,bal);
System.out.println("Congratulation ! Your account is created");
int ch,amt;
do 
{
System.out.println("1-> deposit \n 2. withdraw \n 3-> Display \n 4-> Exit");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter amount to deposit :");
amt=sc.nextInt();
b.deposit(amt);
break;
 case 2:
System.out.print("Enter ammount to withdraw");
amt=sc.nextInt();
b.withdraw(amt);
break;
 case 3:
b.display();
break;
case 4:
break;
default:
System.out.println("Invalid choice");
break;
}
}
while(ch!=4);
}
}
