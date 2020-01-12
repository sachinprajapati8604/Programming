/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;

/**
 *
 * @author Sachin Prajapati
 */
import java.util.*;
class test
{
    int id;
String name;
test(String name,int id)
{
this.name=name;
this.id=id;
}
String getName()
{
return name;
}
int getId()
{
return id;
}
}
public class InputConstructor {
    public static void main(String bu[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your name : ");
        String name=sc.nextLine();
        System.out.print("Enter id : ");
        int id=sc.nextInt();
        
        test t=new test(name,id);
        System.out.println("**********DETAILS**********");
        System.out.println("name :"+t.getName());
        System.out.println("Id :"+t.getId());
        
        
        
        
    }
}
