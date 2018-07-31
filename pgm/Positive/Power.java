import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		double base=sc.nextInt();
		double exp=sc.nextInt();
        double result = Math.pow(base, exp);
        int i=(int) result;

        System.out.println("Answer = " + result);
    }
}
	
