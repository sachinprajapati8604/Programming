//method overriding

import java.util.*;
class Bank
{
int getInterest()
{
return 0;
}
}
class Sbi extends Bank
{
int getInterest()     //override
{
return 7;
}
}
class Pnb extends Bank
{
int getInterest()
{
return 6;
}
}
class P1
{
public static void main(String bu[])
{
Sbi s=new Sbi();
System.out.println("Interest rate of Sbi "+s.getInterest());

Pnb p=new Pnb();
System.out.println("Interest rate of Pnb "+p.getInterest());

}
}
