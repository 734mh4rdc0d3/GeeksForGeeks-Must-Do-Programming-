import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int test  = Integer.parseInt(br.readLine());
	    while (test-- > 0 )
	    {
	        String []buff = br.readLine().split("\\s+");
	        int row = Integer.parseInt(buff[0]);
	        int col = Integer.parseInt(buff[1]);
	        buff = br.readLine().split("\\s+");
	        int [][]arr = new int[row][col];
	        for(int i=0; i< row;i ++)
	        {
	            for (int j=0; j < col;  j++)
	            {
	                arr[i][j] = Integer.parseInt(buff[i*col + j]);
	            }
	        }
	        int row_low=0,col_low=0;
	        int total_count = row*col;
	        row--;
	        col--;
	        int count = 0;
	        while(row_low  <= row && col_low <= col)
	        {
	            for(int i= col_low;i <= col;i++)
	            {
	                System.out.print(arr[row_low][i]+" ");
	                count++;
	            }
	            if(count == total_count)break;
	            row_low++;
	            for(int i=row_low ; i<= row;i++)
	            {
	                System.out.print(arr[i][col]+" ");
	                count++;
	            }
	            if(count== total_count)break;
	            col--;
	            for( int i = col ; i >= col_low; i-- )
	            {
	                System.out.print(arr[row][i]+" ");
	                count++;
	            }
	            if(count== total_count)break;
	            row--;
	            for (int i = row; i >= row_low ; i--)
	            {
	                System.out.print(arr[i][col_low]+" ");
	                count++;
	            }
	            if(count == total_count)break;
	            col_low++;
	        }
	        System.out.println();
	    }
	 }
}