import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone24
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,min,i;
		Scanner s=new Scanner(System.in);
		int a[]=new int[20];
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			a[i]=s.nextInt();
		}
		min=a[1];
		for(i=1;i<=n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println(min);
		
	}
}
