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
	        long total = 0L;
	        String []buff = br.readLine().split("\\s+");
	        for (int i = 0; i < size - 1; i++)
	        {
	            total += Integer.parseInt(buff[i]);
	        }
	        long total_sum = size;
	        total_sum *= (size + 1);
	        total_sum /= 2;
	        System.out.println(total_sum - total);
	    }
	 }
}