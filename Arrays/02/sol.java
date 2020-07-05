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
	    StringBuffer sb = new StringBuffer();
	    while (test-- > 0)
	    {
	        int size = Integer.parseInt(br.readLine());
	        arr = new int[size];
	        String []buff = br.readLine().split("\\s+");
	        for (int i = 0; i < size; i++)
	        {
	            arr[i] = Integer.parseInt(buff[i]);
	        }
	        sb.append(totalCount()+"\n");
	    }
	    System.out.print(sb);
	 }
	 static int totalCount()
	 {
	     Arrays.sort(arr);
	     int size = arr.length;
	     int total = 0;
	     for (int i = size - 1; i > 1; i--)
	     {
	         total += getCount( arr[i], i - 1);
	     }
	     return total == 0 ? -1 : total;
	 }
	 static int getCount( int val, int high)
	 {
	     int total = 0;
	     int low = 0;
	     int tempSum = 0;
	     while (low < high)
	     {
	         tempSum = arr[low] + arr[high];
	         if (tempSum == val)
	         {
	             total++;
	             low++;
	             high--;
	         }
	         else if (tempSum < val)
	         {
	            low++; 
	         }
	         else high--;
	     }
	     return total;
	 }
}