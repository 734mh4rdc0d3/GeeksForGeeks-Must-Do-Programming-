
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class MinimumPlatforms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine().trim());
        while (test-- > 0)
        {
            int numberOfTrains = Integer.parseInt(br.readLine().trim());
            String []s = br.readLine().split("\\s+");
            Duration []Time = new Duration[2*numberOfTrains];
            for(int i=0;i<numberOfTrains;i++)
            {
                Time[i] = new Duration(Integer.parseInt(s[i]),true);
            }
            s = br.readLine().split("\\s+");
            for(int i=0;i< numberOfTrains;i++)
            {
                Time[numberOfTrains + i] = new Duration(Integer.parseInt(s[i]),false);
            }
            int count = 0,max = 0;
            Arrays.sort(Time, new CompareClass());
            for(int i=0;i<2*numberOfTrains;i++)
            {
                if(Time[i].getValue()==false)
                {
                    max = Math.max(count,max);
                    count--;
                }
                else count++;
            }
            System.out.println(Math.max(count, max));
            //System.out.println(Arrays.toString(Time));
        }
    }
}

class Duration
{
    public int time;
    public boolean value;
    Duration(int time,boolean value)
    {
        this.time = time;
        this.value = value;
    }
    boolean getValue()
    {
        return this.value;
    }

}
class CompareClass implements Comparator<Duration>
{
    public int compare(Duration t1,Duration t2)
    {
        return t1.time - t2.time;
    }
}