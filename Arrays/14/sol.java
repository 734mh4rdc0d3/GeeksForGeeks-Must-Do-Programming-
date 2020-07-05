
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        while(test-->0)
        {
            int size = Integer.parseInt(br.readLine());
            int []arr = new int[size];
            String []s = br.readLine().split("\\s+");
            for(int i=0;i<size;i++)arr[i] = Integer.parseInt(s[i]);
            int k = Integer.parseInt(br.readLine());
            sb.append(smallest(arr,0,arr.length-1,k-1)+"\n");
        }
        System.out.print(sb);
    }
    static int smallest(int []arr,int low,int high,int k)
    {
        int pivot = findPivot(arr,low,high);
        //System.out.println(Arrays.toString(arr)+"low: "+low+" high: "+high+" pivot: "+pivot+" k: "+k);
        if(pivot == k)return arr[pivot];
        if(pivot < k)return smallest(arr,pivot+1,high,k);
        return smallest(arr,low,pivot-1,k);
    }
    static int findPivot(int []arr,int low,int high)
    {
        int pivot = arr[low];
        int i = low;
        int temp;
        for(int j = i+1;j<=high;j++)
        {
            if(arr[j]<= pivot)
            {
                temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
        return i;
    }
}
