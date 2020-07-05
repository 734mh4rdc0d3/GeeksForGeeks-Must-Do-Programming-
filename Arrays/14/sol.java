

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
	        int []arr = new int[size];
	        String []buff = br.readLine().split("\\s+");
	        for (int i = 0; i < size; i++)
	        {
	            arr[i] = Integer.parseInt(buff[i]);
	        }
	        int k = Integer.parseInt(br.readLine());
	        Arrays.sort(arr);
	        System.out.println(arr[k-1]);
	    }
	 }
}
