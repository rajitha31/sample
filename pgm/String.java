import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String string = "yes";
        boolean numeric = true;
 
        try {
                Double num = Double.parseDouble(string);
            }    catch (NumberFormatException e)
        {
            numeric = false;
        }
 
        if(numeric)
            System.out.println(string + " ");
        else
            System.out.println(string + " ");
	}
}
