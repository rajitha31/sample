import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Mul
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int fact=1,n;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=i*n;
			System.out.println(+fact);
		}
	}
}
