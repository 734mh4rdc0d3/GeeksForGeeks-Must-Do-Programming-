import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int test = Integer.parseInt(br.readLine());
	    while (test-- > 0)
	    {
	        int size = Integer.parseInt(br.readLine());
	        long []arr = new long[size];
	        String []buff = br.readLine().split("\\s+");
	        for (int i = 0; i < size; i++)
	        {
	            arr[i] = Integer.parseInt(buff[i]);
	        }
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < size; i++)
	        {
	            max = Math.max(max, (int)arr[i]);
	        }
	        max++;
	        //System.out.println(Arrays.toString(arr));
	        int low = 0,high = size-1;
	        for(int i = 0; i < size; i++)
	        {
	            if ( i%2 == 0)
	            arr[i] = arr[i] + (arr[high--] % max) * max;  
	            else
	            arr[i] = arr[i] + (arr[low++] % max) * max;   
	        }
	        //System.out.println(Arrays.toString(arr));
	        for(int i = 0; i < size; i++)
	        {
	            arr[i] /= max;
	        }
	        for(int i = 0; i < size; i++)
	        {
	            System.out.print(arr[i]+ " ");
	        }
	        System.out.println();
	    }
	 }
}