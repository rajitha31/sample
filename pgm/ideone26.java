import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone26
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,sum;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		sum=n1+n2;
		if(sum%2==0)
		{
			System.out.println("even");
		}
		else
		System.out.println("odd");
	}
}
