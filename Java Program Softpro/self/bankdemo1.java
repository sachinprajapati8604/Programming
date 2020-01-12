import java.util.Scanner;
class bankdemo1
{
String name;
long accnum;
String acctype;
double balance;
void setValue(String name ,long accnum,String acctype,double balance)
{
this.name=name;
this.accnum=accnum;
this.acctype=acctype;
this.balance=balance;
}
void deposit(int amount)
{
balance=balance+amount;
System.out.println("The amount is credited");
}
void withdraw(int amount)
{
if(balance>=amount)
{
balance=balance-amount;
System.out.println("The amount is debited");
}
else 
{
System.out.println("Unsufficient balance");
}
}
void display()
{
System.out.println("Account holder name :"+name);
System.out.println("Balance in account :"+balance);
}

public static void main(String bu[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Account Holder Name :");
String name=sc.nextLine();
System.out.print("Enter account type :");
String acctype=sc.nextLine();
System.out.print("Enter account Number :");
long accnum=sc.nextLong();
System.out.print("Enter account opening balance :");
int balance=sc.nextInt();


bankdemo1 b=new bankdemo1();

b.setValue(name,accnum,acctype,balance);
System.out.println("Congratulation Your account is created");
int ch,amt=0;
do
 { System.out.println("1-> deposit \n 2-> withdraw  \n 3-> display \n 4-> exit");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter ammount to deposit");
amt=sc.nextInt();
b.deposit(amt);
break;
case 2:
System.out.println("Enter ammount to withdraw");
amt=sc.nextInt();
b.withdraw(amt);
break;
case 3:
b.display();
break;
case 4:
break;
default:
System.out.println("Invalid Choice");
break;
}
}
while(ch!=4);
}
}


 




