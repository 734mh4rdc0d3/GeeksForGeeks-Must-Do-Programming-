def getDiff(ls, grp):
    ls.sort()
    i = 1
    size = len(ls)
    val = ls[grp] - ls[0]
    while i + grp < size:
        val = min(val, ls[i+grp] - ls[i])
        i += 1
    return val


for t in range(int(input())):
    size = int(input())
    ls = [int(x) for x in input().split()]
    grp = int(input())
    print(getDiff(ls, grp - 1))
