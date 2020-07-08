def check(a,b):
    if a is '(' and b is  ')':
        return False
    if a is '{' and b is '}':
        return  False
    if a is '[' and b is ']':
        return False
    return True
                
class Stack:
    def __init__(self):
        self.ls = []
    def push(self,val):
        self.ls.append(val)
    def pop(self):
        if len(self.ls) == 0:
            return -1
        return self.ls.pop()
    def isEmpty(self):
        return len(self.ls) == 0
for t in range(int(input())):
    a = input()
    st = Stack()
    flag = False
    for i in a:
        if i in "{([":
            st.push(i)
        else:
            p = st.pop()
            if check(p,i):
                flag = True
                break
    if flag or  not st.isEmpty():
        print('not balanced')
    else:
        print('balanced')
