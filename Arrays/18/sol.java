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
	        stock();
	    }
	 }
	 static void stock()
	 {
	     StringBuffer sb = new StringBuffer();
	     int start = 0;
	     boolean flag = true;
	     for (int i = 1; i < arr.length; i++)
	     {
	         if (arr[i] < arr[i - 1])
	         {
	             if ( i - start == 1)
	             {
	                 start = i;
	             }
	             else
	             {
	                 flag = false;
	                 sb.append("("+start+" "+(i-1)+")"+" ");
	                 start = i;
	             }
	         }
	     }
	     if( arr[arr.length - 1] > arr[start] && arr.length - 1 > start )
	     {
	        sb.append("("+ start+ " "+(arr.length - 1)+")");
	        flag = false;
	     }
	     if (flag)sb.append("No Profit");
	     System.out.println(sb);
	     return;
	 }
}