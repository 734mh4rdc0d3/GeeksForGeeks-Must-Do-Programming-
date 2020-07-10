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
	        String []buff = br.readLine().split("\\s+");
	        int size = Integer.parseInt(buff[0]);
	        int k = Integer.parseInt(buff[1]);
	        int []arr = new int[size];
	        buff = br.readLine().split("\\s+");
	        StringBuffer sb = new StringBuffer();
	        for(int i = 0; i < size; i++)
	        {
	            arr[i] = Integer.parseInt(buff[i]);
	        }
	        Deque<Integer> dq = new LinkedList<Integer>();
	        int i = 0;
	        for (; i < k; i++)
	        {
	            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
	            {
	                dq.removeLast();
	            }
	            dq.addLast(i);
	        }
	        for(; i < size; i++)
	        {
	            sb.append(arr[dq.peekFirst()]+" ");
	            while ( !dq.isEmpty() && dq.peek() <= i - k)
	            {
	                dq.removeFirst();
	            }
	            while ( !dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
	            {
	                dq.removeLast();
	            }
	            dq.addLast(i);
	        }
	        sb.append(arr[dq.peekFirst()]);
	        System.out.println(sb);
	    }
	 }
}