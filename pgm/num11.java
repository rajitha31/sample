import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class num11
{
	public static void main (String[] args) throws java.lang.Exception
	{
				int i,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
			System.out.print(1);
 
			for(i=2;i<=n;i++)
			{
				if(n%i==0)
				{
					System.out.print(" "+i);
				}
			}
		}
		else
		System.out.println("enter only positive numbers");
	}
}
