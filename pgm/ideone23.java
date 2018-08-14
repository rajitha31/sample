import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone23
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
	 String str=sc.next();
	 int a=0,b=0,te=0;
	 for(int i=0;i<str.length();i++)
	 {
	 	char ch=str.charAt(i);
	 	if(ch=='i')
	 	{
	 		a=1;
	 	}
	 	else if(ch=='0')
	 	{
	 		b=1;
	 	}
	 	else if(ch!='1'||ch!='0')
	 	{
	 		te=1;
	 	}
	 	if( a==1 && b==1 && te==0)
	 	System.out.print("yes");
	 	else
	 	System.out.print("no");
	 }
	}	
}
