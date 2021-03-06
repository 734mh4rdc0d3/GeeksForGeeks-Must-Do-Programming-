# Your task is to complete this function

'''

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

'''

# This function should rotate list counter-
# clockwise by k and return head node
def rotateList(head, k):
    if k == 0:
        return head
    ptr1 = head
    new_head = None
    for i in range(k):
        new_head = ptr1
        ptr1 = ptr1.next
    if new_head != None:
        new_head.next = None
    if ptr1 == None:
        return head
    ptr2 = ptr1
    while ptr2.next != None:
        ptr2 = ptr2.next
    ptr2.next = head
    head = ptr1
    return head


#{ 
#  Driver Code Starts
# driver

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
    
    def insert(self,val):
        if self.head is None:
            self.head = Node(val)
            self.tail = self.head
        else:
            self.tail.next = Node(val)
            self.tail = self.tail.next

def printList(n):
    while n:
        print(n.data, end=' ')
        n = n.next
    print()

if __name__=="__main__":
    for _ in range(int(input())):
        n = int(input())
        arr = [int(x) for x in input().split()]
        k = int(input())
        
        lis = LinkedList()
        for i in arr:
            lis.insert(i)
        
        head = rotateList(lis.head,k)
        printList(head)
# } Driver Code Ends