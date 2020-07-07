# A linked list (LL) node 
# to store a queue entry 
class Node: 
      
    def __init__(self, data): 
        self.data = data 
        self.next = None
        
class MyQueue:
    
    
     # Method to add an item to the queue
     def __init__(self):
         self.head = None
     def push(self, item): 
         if self.head is None:
             self.head = Node(item)
             return
         ptr = self.head
         while ptr.next is not None:
             ptr = ptr.next
         ptr.next = Node(item)
         return
         #Add code here
    
    # Method to remove an item from queue
     def pop(self):
         if self.head is None:
             return -1
         data = self.head.data
         self.head = self.head.next
         return data
         
         #add code here



#{ 
#  Driver Code Starts
if __name__=='__main__':
    t=int(input())
    for i in range(t):
        s=MyQueue()
        q=int(input())
        q1=list(map(int,input().split()))
        i=0
        while(i<len(q1)):
            if(q1[i]==1):
                s.push(q1[i+1])
                i=i+2
            elif(q1[i]==2):
                print(s.pop(),end=" ")
                i=i+1
            elif(s.isEmpty()):
                print(-1)
                i=i+1
        print()   
# } Driver Code Ends