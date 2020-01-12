//exception example
class exdemo1
{
public static void main(String bu[])
{
System.out.println("Aneesh in 1st class");
System.out.println("Aneesh in 2nd class");
System.out.println("....................");
System.out.println("Aneesh in 10th class");
System.out.println("Aneesh in 12th class");
System.out.println("Aneesh in Btech cse class");
System.out.println("Aneesh become software engineer");
try
{
System.out.println("Aneesh weds" +10/0+"bela");    //if this block execute then catch block will not execute 
}
catch(Exception ex)
{
System.out.println("Aneesh weds Anushka");
}
System.out.println("Aneesh Kids");   //future plan
}
}