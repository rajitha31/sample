import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone18
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,r,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
			while(n!=0)
			{
				r=n%10;
				count++;
				n=n/10;
			}
			System.out.println(count);
		}
		else
		System.out.println("enter only positive number");
	}
}
