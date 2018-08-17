import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class num6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String r;
	int cnt=0;
	char ch;
	Scanner in=new Scanner(System.in);
	r=in.next();
	String t=r.toLowerCase();
	for(int i=0;i<t.length();i++){
		ch=t.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){	
	cnt++;}}
	if(cnt==1){
	System.out.println("yes");
	}
	else {
		System.out.println("No");
	}
}
}
