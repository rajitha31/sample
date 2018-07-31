import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Oddnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
       System.out.println("The odd numbers are:");
       for(int i=1;i<=50;i++)
       {
       	if(i % 2!=0)
       	{
       		System.out.print(i+" ");
       	}
       }
       
	}
}
