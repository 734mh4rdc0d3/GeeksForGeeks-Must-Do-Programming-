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
	        HashSet<String> hs = new HashSet<>();
	        HashSet <String> q = new LinkedHashSet<>();
	        int size = Integer.parseInt(br.readLine());
	        String []buff = br.readLine().split("\\s+");
	        String ans;
	        for (int i = 0; i < size; i++)
	        {
	           if(hs.contains(buff[i]))
	           {
	               if(q.contains(buff[i]))
	               q.remove(buff[i]);
	           }
	           else
	           {
	               hs.add(buff[i]);
	               q.add(buff[i]);
	           }
	           if(q.size()==0)System.out.print("-1 ");
	           else System.out.print(q.iterator().next()+" ");
	        }
	        System.out.println();
	    }
	 }
}