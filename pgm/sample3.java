import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class sample3

{
	public static void main (String[] args) throws java.lang.Exception
	{
		string str;
		char ch;
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(i=0;i=str.length();i++)
		{
			if(character.isDigit(str.chartAt(i)))
			{
				count++;
			}
			System.out.println(count);
		}
	}
}
