package inetexample;
import java.net.*;
import java.io.*;
public class InetExample
{
	public static void main(String bu[])
	{
		try
		{
			InetAddress IP=InetAddress.getByName("www.google.com");
			System.out.println(" Host address (IP address) : "+IP.getHostName());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}