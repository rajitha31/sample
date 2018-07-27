import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Alphabet
{
	public static void main (String[] args) throws java.lang.Exception
	{
				char d;
		Scanner sc=new Scanner(System.in);
		d=sc.next().charAt(0);
		if((d >= 'a' && d <='z') || (d >= 'A' && d <= 'Z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("No");
		}
	}
}
	

	
