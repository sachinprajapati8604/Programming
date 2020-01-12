class Employee
{
	int empid;          //instance variable or non-static variable 
	String empname;     //instance variable or non-static variable 
	long salary;         //instance variable or non-static variable 
	void setEmployee(int eid,String ename,long sal)
	{
		empid=eid;
		empname=ename;
		salary=sal;
	
	}
	void display()
	{
		System.out.println("Employee id ="+empid);
		System.out.println("Employee name ="+empname);
		System.out.println("Employee salary ="+salary);
	}
}
class classdemo2
{
	public static void main(String bu[])
	{
		Employee e1=new Employee();
	    Employee e2=new Employee();
		e1.setEmployee(1001,"Sachin Prajapati",9800000);
		e1.display();
		e2.setEmployee(1002,"Chotu",20);
		e2.display();
		
	}
}
