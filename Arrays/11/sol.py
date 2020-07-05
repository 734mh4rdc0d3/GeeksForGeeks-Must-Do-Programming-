for t in range(int(input())):
    size = int(input())
    ls = [int(x) for x in input().split()]
    arr = []
    large = -1
    for i in range(size -1,-1,-1):
        if(ls[i] >= large):
            large = ls[i]
            arr.append(large)
    arr = arr[::-1]
    print(str(arr)[1:-1].replace(',',' '))