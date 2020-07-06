
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationsOfAGivenString {
    private static String  []myStrings;
    static int ptr = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine().trim());
        while(test-->0)
        {
            String s = br.readLine();
            getAll(s);
            Arrays.sort(myStrings);
            System.out.println(String.join(" ", myStrings));
        }
    }
    private static void getAll(String s){
        int total = getFactorial(s.length());
        myStrings = new String[total];
        ptr = 0;
        insertString(0,s);
    }
    private static void insertString(int start, String str)
    {

        if(start == str.length())
        {
                myStrings[ptr++] = str;
            return;
        }
        insertString(start+1,str);
        for(int i=start+1;i<str.length();i++)
        {
            String tempStr = str.substring(0,start)+str.charAt(i)+str.substring(start+1,i)+str.charAt(start)+
                    str.substring(i+1);
            insertString(start+1,tempStr);
        }
        return;
    }
    private  static int getFactorial(int n)
    {
        int result = 1;
        for(int i=2;i<=n;i++)result *= i;
        return result;
    }
}
