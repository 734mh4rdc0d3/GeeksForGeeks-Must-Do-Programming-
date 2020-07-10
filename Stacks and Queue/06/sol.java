// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

  public class LRUDesign {

    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr = 0;

            for (int i = 0; (i < queries) && (itr < len); i++) {
                String queryType = str[itr++];
                if (queryType.equals("SET")) {
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key, value);
                }
                if (queryType.equals("GET")) {
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// design the class in the most optimal way

class LRUCache
{
    static HashSet<Integer> hs;
    static HashMap<Integer,Integer> hm;
    static int cacheSize;
    LRUCache(int cap)
    {
        hs = new LinkedHashSet<Integer>();
        hm = new HashMap<Integer,Integer>();
        cacheSize = cap;
        // Intialize the cache capacity with the given
        // cap
    }

    // This method works in O(1)
    public static int get(int key)
    {
        if(!hs.contains(key)) return -1;
        hs.remove(key);
        hs.add(key);
        return hm.get(key);
        // your code here
    }

    // This method works in O(1)
    public static void set(int key, int value)
    {
        
        if(hs.contains(key))
        {
            hs.remove(key);
            hm.remove(key);
        }
        if(hs.size() == cacheSize)
        {
            int ri = hs.iterator().next();
            hs.remove(ri);
            hm.remove(ri);
        }
        hs.add(key);
        hm.put(key,value);
        // your code here
    }
}
