import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int []arr;
	public static void main (String[] args)throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int test = Integer.parseInt(br.readLine());
	    while (test-- > 0)
	    {
	        int size = Integer.parseInt(br.readLine());
	        arr = new int[size];
	        String []buff = br.readLine().split("\\s+");
	        for (int i = 0; i < size; i++)
	        {
	            arr[i] = Integer.parseInt(buff[i]);
	        }
	        printZigZag();
	    }
	 }
	 static void printZigZag()
	 {
	     boolean flag = true;
	     int temp;
	     for(int i = 0; i < arr.length - 1; i ++)
	     {
	         if (flag)
	         {
	             if ( arr[i] > arr[i + 1])
	             {
	                 temp = arr[i];
	                 arr[i] = arr[i + 1];
	                 arr[i + 1] = temp;
	             }
	         }
	         else
	         {
	             if ( arr[i] < arr[i + 1])
	             {
	                 temp = arr[i] ;
	                 arr[i] = arr[i + 1];
	                 arr[i + 1] = temp;
	             }
	         }
	         flag = !flag;
	     }
	     for(int i = 0 ;i < arr.length; i++)
	     {
	         System.out.print(arr[i]+" ");
	     }
	     System.out.println();
	     return;
	 }
}