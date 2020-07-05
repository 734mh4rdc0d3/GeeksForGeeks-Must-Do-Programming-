import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int test = Integer.parseInt(br.readLine().trim());
	    while(test-->0)
	    {
	        int size = Integer.parseInt(br.readLine().trim());
	        String []s = br.readLine().split("\\s+");
	        if(size==1){
	            System.out.println(1);
	            continue;
	        }
	        int []arr = new int[size];
	        long sum =0;
	        for(int i=0;i<size;i++)
	        {
	            arr[i] =Integer.parseInt(s[i]);
	            sum +=arr[i];
	        }
	        sum -=arr[0];
	        long other =0;
	        int pivot =0;
	        while(++pivot<size)
	        {
	            other+=arr[pivot-1];
	            sum -=arr[pivot];
	            if(sum==other)break;
	        }
	        if(pivot==size)System.out.println(-1);
	        else System.out.println(pivot+1);
	    }
	 }
}