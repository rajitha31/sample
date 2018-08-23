import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class num24
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String name = "admin";
    int nameLenght = name.length(); 

    for(int i = 0; i < nameLenght ; i++){          
        char character = name.charAt(i); 
        int ascii = (int) character;
        System.out.println(character+" = "+ ascii); 
	}
}
}
