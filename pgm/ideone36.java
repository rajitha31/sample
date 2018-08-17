import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone36
{
	public static void main (String[] args) throws java.lang.Exception
	{
		

	Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        if(sb.toString().equals(s))
        {
        	System.out.print("yes");
        }
        else
        	System.out.print("no");
	}
}

		
