import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone30
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int temp,n;
		boolean prime=true;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			temp=n+i;
			if(temp==0)
			{
				prime=false;
				break;
			}
		}
		if(prime)
		System.out.println("yes");
		else
		System.out.println("odd");
	}
}
