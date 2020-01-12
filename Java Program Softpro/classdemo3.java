/*Create a class with name student having variable id,name.
create two method intialized and display().The intialize() methhod assign values to id and name variable and displaY() METHOD .dispaly the value of id and  name 
.store details of three student and display details.
*/

class Student
{
	int stid;
	String stname;
	void setStudent(int id,String name)
	{
		stid=id;
		stname=name;
	}
	void display()
	{
		System.out.println("Id of student ="+stid);
		System.out.println("Name of student ="+stname);
	}

}
class classdemo3
{
	public static void main(String bu[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.setStudent(1001,"Sachin");
		s1.display();
		s2.setStudent(1002,"Chotu");
		s2.display();
	}
}