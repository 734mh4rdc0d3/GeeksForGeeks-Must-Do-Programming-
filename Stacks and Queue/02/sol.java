import java.util.*;
import java.lang.*;
import java.io.*;
    class Node
    {
        public long value;
        public int index;
        Node(long value,int index)
        {
            this.value = value;
            this.index = index;
        }
    }
class GFG
 {

	public static void main (String[] args)throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int test = Integer.parseInt(br.readLine());
	    while (test-- > 0)
	    {
	        int size = Integer.parseInt(br.readLine());
	        Stack<Node> st = new Stack<>();
	        String []buff = br.readLine().split("\\s+");
	        long []arr = new long[size];
	        st.push(new Node(Long.parseLong(buff[0]),0));
	        long num;
	        Node temp = null;
	        for (int i = 1; i < size; i++)
	        {
	            num = Long.parseLong(buff[i]);
	            while (!st.empty() && num > st.peek().value)
	            {
	                temp = st.pop();
	                arr[temp.index] = num;
	            }
	            st.push(new Node(num,i));
	        }
	        while(!st.empty())
	        {
	            temp = st.pop();
	            arr[temp.index] = -1;
	        }
	        for (int i = 0; i < size; i++)System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 }
}