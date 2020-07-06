def check(ls):
    if(len(ls[0]) != len(ls[1])):
        return "NO"
    dic = {}
    for i in ls[0]:
        dic[i] = dic.get(i, 0) + 1
    for i in ls[1]:
        dic[i] = dic.get(i, 0) - 1
    for i in dic.keys():
        if dic[i] != 0:
            return "NO"
    return "YES"


for t in range(int(input())):
    words = input().split()
    print(check(words))
