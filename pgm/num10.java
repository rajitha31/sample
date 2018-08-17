import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class num10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
           int f=0;
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
          for(int i=2;i<n;i++){
              if(n%i==0){
                  f=1;
                  break;
              }
          }
           if(f==1){
               System.out.println("YES");
           }
         else{
               System.out.println("NO");
	}
}
}
