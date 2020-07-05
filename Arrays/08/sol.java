
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
*Given an array of positive integers. The task is to find inversion count of array.

* Inversion Count : For an array, inversion count indicates how far (or close) the array is from being sorted.
* If array is already sorted then inversion count is 0.
* If array is sorted in reverse order that inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 */
public class InversionOfArray {
    static long invertCount(int[] arr,int low,int mid, int high)
    {
        int []left = Arrays.copyOfRange(arr,low,mid+1);
        int []right = Arrays.copyOfRange(arr,mid+1,high+1);
        int leftPtr = 0, rightPtr = 0, ptr = 0;
        long count = 0;
        //System.out.println(low+" "+mid+" "+high);
        //System.out.println(Arrays.toString(left)+Arrays.toString(right));
        while(leftPtr < left.length && rightPtr < right.length)
        {
            if(left[leftPtr]<=right[rightPtr])
            {
                arr[low+ptr++] = left[leftPtr++];
            }
            else
            {
                count += mid+1-leftPtr-low;
                arr[low+ptr++] = right[rightPtr++];
            }
        }
        while( leftPtr < left.length)
        {
            arr[low +ptr++] = left[leftPtr++];
        }
        while(rightPtr < right.length)
        {
            arr[low + ptr++] = right[rightPtr++];
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.println(" count: "+ count);
        return count;

    }
    static long invert(int []arr,int low,int high)
    {
        long count = 0;
        if(low < high)
        {
            int mid = low + (high -low)/2;
            count += invert(arr,low,mid);
            count += invert(arr,mid+1, high);
            count += invertCount(arr,low,mid,high);
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-->0)
        {
            int size = Integer.parseInt(br.readLine());
            String []s = br.readLine().split("\\s+");
            int []arr  = new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i] = Integer.parseInt(s[i]);
            }
            System.out.println(invert(arr,0,arr.length-1));
        }
    }
}
