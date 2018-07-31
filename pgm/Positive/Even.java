
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int j=20;
       System.out.println("The even numbers are:");
       for(int i=1; i <= j; i++)
       {
       	if(i % 2==0)
       	{
       		System.out.print(i+" ");
       	}
       }
       
	}
}
