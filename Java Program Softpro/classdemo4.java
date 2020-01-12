class student
{
int rollno;
String name;
long fee;
student(int rollno,String name,long fee)  //Parameterized constructor
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println("Roll NO :"+rollno); //we can +this.rollno also where rollno
System.out.println("Name :"+this.name);
System.out.println("Fee :"+this.fee);
}
}
class classdemo4
{
public static void main(String bu[])
{
new student(1001,"Sachin Prajapati",67200).display();
//student s=new Scanner(1001,"Sachin Prajapati",67200);
//s.display();
}
}