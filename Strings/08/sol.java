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
	        String word = br.readLine();
	        System.out.println(check(word));
	    }
	 }
	 static String check(String word)
	 {
	     HashSet<Character>hs = new HashSet<>();
	     StringBuffer sb = new StringBuffer();
	     for (int i = 0; i < word.length(); i++)
	     {
	         if(!hs.contains(word.charAt(i)))
	         {
	             hs.add(word.charAt(i));
	             sb.append(word.charAt(i));
	         }
	     }
	     return sb.toString();
	 }
}