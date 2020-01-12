/* Example of multilevel inheritence */

import java.util.*;
class Employee
{
String empid;
String empname;
void setEmployee(String eid, String ename)
{
empid=eid;
empname=ename;
}
void getEmployee()
{
System.out.println("Employee ID :"+empid);
System.out.println("Employee Name :"+empname);
}
}
class Payroll extends Employee
{
int bs;
int hra;
int da;
void setPayroll(int b)
{
bs=b;
hra=(b*30)/100;
da=(b*50)/100;
}
void getPayroll()
{
System.out.println("Basic salary :"+bs);
System.out.println("House Rent allowences :"+hra);
System.out.println("Dearness allownces :"+da);
}
}
class Payslip extends Payroll    //run from Payslip
{
void netSalary()
{
System.out.println("Net salary :"+(bs+hra+da));
}
public static void main(String bu[])
{
Payslip ps=new Payslip();
Scanner sc=new Scanner(System.in);
System.out.print("Enter Employee id :");
String eid=sc.nextLine();
System.out.println("Enter EMployee name :");
String ename=sc.nextLine();
ps.setEmployee(eid,ename);
System.out.println("Enter Salary :");
int b=sc.nextInt();
ps.setPayroll(b);
System.out.println("***********************************************PAY SLIP***********************************************");
ps.getEmployee();
ps.getPayroll();
ps.netSalary();



}
}



