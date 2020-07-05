import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static long []arr;
	public static void main (String[] args)throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int test = Integer.parseInt(br.readLine());
	    while (test-- > 0)
	    {
	        int size = Integer.parseInt(br.readLine());
	        arr = new long[size];
	        String []buff = br.readLine().split("\\s+");
	        for (int i = 0; i < size; i++)
	        {
	            arr[i] = Integer.parseInt(buff[i]);
	            arr[i] *= arr[i];
	        }
	        if(get())
	        {
	            System.out.println("Yes");
	        }
	        else System.out.println("No");
	    }
	 }
	 static boolean get()
	 {
	     Arrays.sort(arr);
	     int size = arr.length;
	     for (int i =  size-1; i > 1; --i)
	     {
	         long sum = arr[i];
	         int low = 0,high = i-1;
	         while(low < high)
	         {
	             if(arr[low] + arr[high] == sum)return true;
	             if(arr[low]+arr[high] > sum )high--;
	             else low++;
	         }
	     }
	     return false;
	 }
}