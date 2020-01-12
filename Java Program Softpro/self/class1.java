 class Values
{
int length;
int width;
int heigth;
void setValues(int l,int b,int h)
{
length=l;
width=b;
heigth=h;

}
void display()
{
System.out.println("Length of cuboid ="+length);
System.out.println("width of cuboid ="+width);
System.out.println("height of cuboid ="+heigth);
}
}
class class1
{
public static void main(String bu[])
{
Values v=new Values();
Values v1=new Values();
v.setValues(121,32,65);
v.display();
v1.setValues(133,15,91);
v1.display();
}
}





