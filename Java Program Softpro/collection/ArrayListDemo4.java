//user defined arraylist

import java.util.*;
class Employee
{
int empid;
String empname;
long salary;
Employee(int empid,String empname,long salary)        //using constructor for intializing instances variable
{
this.empid=empid;
this.empname=empname;
this.salary=salary;
}
}
class ArrayListDemo4
{
public static void main(String bu[])
{
ArrayList<Employee> al=new ArrayList<Employee>();
al.add(new Employee(1001,"Sachin Prajapati",96000));
al.add(new Employee(1002,"Sheru",45000));
al.add(new Employee(1003,"Alok Sahu",58000));
al.add(new Employee(1004,"Aneesh Kumar",-964000));
System.out.println("List of Employee");
for(Employee e:al)
{
System.out.println(e.empid +"\t"+e.empname+"\t"+e.salary);
}
}
}