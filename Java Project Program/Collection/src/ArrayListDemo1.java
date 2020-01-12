/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Prajapati
 */
import java.util.*;
public class ArrayListDemo1
{
    public static void main(String bu[])
    {
      ArrayList <String> al=new ArrayList<String>();
      al.add("Satyam");
      al.add("Shiva");
      al.add("Rajni");
      al.add("Vinod");
      al.add("Mahi");
      al.add("Bakki");
      al.add("Nana");
      System.out.println("Names list in acending order");
      Collections.sort(al);
      for(String name:al)
      {
      System.out.println(name);
      }
      System.out.println("Name list in descending order ");
       Collections.reverse(al);
      for(String name:al)
      {
      System.out.println(name);
      }
    }
    
}
