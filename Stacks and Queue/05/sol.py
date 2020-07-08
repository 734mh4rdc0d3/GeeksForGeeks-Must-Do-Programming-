#User function Template for python3

class stack:
    def __init__(self):
        self.s=[]
        self.minEle=None

    def push(self,x):
        if len(self.s) == 0:
            self.s.append(x)
            self.minEle = x
            return
        if x >= self.minEle:
            self.s.append(x)
        else:
            s = 2*x - self.minEle
            self.s.append(s)
            self.minEle = x
        return
        #CODE HERE

    def pop(self):
        if len(self.s) == 0:
            return -1
        p = self.s.pop()
        if p > self.minEle:
            return p
        else:
            s = self.minEle
            self.minEle = self.minEle*2 - p
            if len(self.s) == 0:
                self.minEle = None
            return s
        #CODE HERE
        

    def getMin(self):
        if self.minEle is None:
            return -1
        return self.minEle
        #CODE HERE



#{ 
#  Driver Code Starts
#contributed by RavinderSinghPB
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        q = int(input())

        arr = [int(x) for x in input().split()]

        stk=stack()  

        qi = 0
        qn=1
        while qn <= q:
            qt = arr[qi]

            if qt == 1:
                stk.push(arr[qi+1])
                qi+=2
            elif qt==2:
                print(stk.pop(),end=' ')
                qi+=1
            else:
                print(stk.getMin(),end=' ')
                qi+=1
            qn+=1
        print()

# } Driver Code Ends