// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        	int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            Solution g = new Solution();
            head = g.pairwiseSwap(head);
            printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends




/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/


class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        Node one,two,ptr,myHead = null;
        ptr = head;
        boolean flag = true;
        while (ptr != null)
        {
            one = ptr;
            if(one.next == null)break;
            two = one.next;
            if(flag)
            {
                head = two;
                flag = false;
            }
            else
            {
                myHead.next = two;
            }
            ptr = two.next;
            one.next = two.next;
            two.next = one;
            myHead = one;
        }
        return head;
        // code here
    }
}