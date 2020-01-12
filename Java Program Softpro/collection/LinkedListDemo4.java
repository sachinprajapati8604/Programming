//user defined linked list

import java.util.*;
class Customer
{
int custid;
String custname;
String mno;
Customer(int custid,String custname,String mno)
{
this.custid=custid;
this.custname=custname;
this.mno=mno;
}
}
class LinkedListDemo4
{
public static void main(String bu[])
{
LinkedList<Customer> al=new LinkedList<Customer>();
al.add(new Customer(101,"Sachin Prajapati","8604980059"));
al.add(new Customer(102,"Aneesh Kumar","8840078271"));
al.add(new Customer (103,"Vikas","9623415269"));
al.add(new Customer(104,"Bheem","7896325412"));
System.out.println("*****List of customers*****");
for(Customer c:al)
{
System.out.println(c.custid +"\t"+ c.custname +"\t"+ c.mno);
}
}

}