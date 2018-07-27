import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PositiveNegative
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Postive");
		}
		else if(n==0)
		{
			System.out.println("zero");
		}
		else 
		{
			System.out.println("Negative");
		}
	}
}
