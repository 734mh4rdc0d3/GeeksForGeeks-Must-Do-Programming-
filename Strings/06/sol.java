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
	        String roman = br.readLine();
	        System.out.println(getRoman(roman));
	    }
	 }
	 static int getRoman(String roman)
	 {
	     int previous = 5000;
	     int total = 0;
	     int buffer = 0;
	     int temp= 0;
	     for (int i = 0; i < roman.length(); i++)
	     {
	         temp = convertRoman(roman.charAt(i));
	         if(temp == previous)
	         {
	             buffer += temp;
	         }
	         else
	         {
	             if(temp >previous)
	             {
	                 total = total -buffer;
	             }
	             else
	             {
	                 total += buffer;
	             }
	             previous = temp;
	             buffer = temp;
	         }
	     }
	     total += buffer;
	     return total;
	     
	 }
	 static int convertRoman(char symbol)
	 {
	     if(symbol == 'I')return 1;
	     if(symbol == 'V')return 5;
	     if(symbol == 'X')return 10;
	     if(symbol == 'L')return 50;
	     if(symbol == 'C')return 100;
	     if(symbol == 'D')return 500;
	     if(symbol == 'M')return 1000;
	     return -1;
	 }
}