import java.io.*;
import java.util.*;
 
 class sorarray {
     
    
    public static int swap(int itself,
                            int dummy)
    {
        return itself;
    }
     
    
    static void sortit(int []arr, int n)
    {
        for (int i = 0; i < n; i++) 
        {
     
            
            while (i != (arr[i] - 1)) 
                arr[i] = swap(arr[arr[i] - 1],
                    arr[arr[i] - 1] = arr[i]);     
        }
    }
