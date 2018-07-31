import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int num = 121;
		 boolean flag=false;
		 for(int i=2;i<=num/2;++i)
		 {
		 	if(num % i==0)
		 	{
		 		flag=true;
		 		break;
		 	}
		 	
		 }

        

        
        if(!flag)
        

        
        
            System.out.println(num + " is a primenumber");
        else
            System.out.println(num + " is not a primenumber");
	}
}
