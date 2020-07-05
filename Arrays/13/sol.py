def reverse_group(ls,grp):
    total = len(ls)
    i = 0
    while i < total:
        high = min(i + grp, total)
        high -= 1 
        low = i
        while low < high:
            ls[low],ls[high] = ls[high],ls[low]
            low += 1
            high -= 1
        i += grp
    for i in ls:
        print(i,end="")
        print(' ',end="")
    print()
    #print(str(ls)[1:-1].replace(',',' '))
    return
        
for t in range(int(input())):
    size,grp = map(int,input().split())
    ls = [int(x) for x in input().split()]
    reverse_group(ls,grp)