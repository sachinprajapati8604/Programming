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

public class ArrayListDemo2 {
 public static void main(String bu[])
 {
   ArrayList<String> al1=new ArrayList<String>();
   ArrayList<String> al2=new ArrayList<String>();
   al1.add("Sachin");
   al1.add("Abhishek");
   al1.add("Binay");
   al1.add("Zara");
   al2.add("1001");
   al2.add("1002");
   al2.add("1003");
   al2.add("1004");
   al1.addAll(al2);
   Collections.sort(al1);
   for(String name:al1)
   {
   System.out.println(name);
   }
   
 }
}