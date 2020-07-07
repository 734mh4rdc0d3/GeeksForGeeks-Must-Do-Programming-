#User function Template for python3

''' Node for linked list:

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

'''
def reverse(head):
    ptr = head.next
    lastNode = head
    while ptr is not None:
        temp = ptr.next
        ptr.next = head
        head = ptr
        ptr = temp
    lastNode.next = None
    return head
    

def addLists(first, second):
    #printList(first)
    #printList(second)
    first = reverse(first)
    second = reverse(second)
    #printList(first)
    #printList(second)
    carry = 0
    head = first
    while first.next is not None and second.next is not None:
        first.data += second.data + carry
        if first.data > 9:
            first.data %= 10
            carry = 1
        else:
            carry = 0
        first = first.next
        second = second.next
    first.data += second.data + carry
    if first.data > 9:
        first.data %= 10
        carry = 1
    else:
        carry = 0
    if first.next is None:
        first.next = second.next
    while carry == 1:
        if first.next is None:
            first.next = Node(1)
            carry = 0
        else:
            first.next.data += 1
            if first.next.data > 9:
                first.next.data %= 10
                first = first.next
                carry = 1
            else:
                carry = 0
                
    return reverse(head)
                
                
    # code here
    # return head of sum list



#{ 
#  Driver Code Starts
#Initial Template for Python 3

# Node Class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# Linked List Class
class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    # creates a new node with given value and appends it at the end of the linked list
    def insert(self, val):
        if self.head is None:
            self.head = Node(val)
            self.tail = self.head
        else:
            self.tail.next = Node(val)
            self.tail = self.tail.next

# prints the elements of linked list starting with head
def printList(n):
    while n:
        print(n.data,end=' ')
        n = n.next
    print()

if __name__ == '__main__':
    for _ in range(int(input())):
        
        n = int(input())
        arr1 = ( int(x) for x in input().split() )
        LL1 = LinkedList()
        for i in arr1:
            LL1.insert(i)
        
        m = int(input())
        arr2 = ( int(x) for x in input().split() )
        LL2 = LinkedList()
        for i in arr2:
            LL2.insert(i)
        
        res = addLists(LL1.head, LL2.head)
        printList(res)
# } Driver Code Ends