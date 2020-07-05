for t in range(int(input())):
    size = input()
    arr = [int(x) for x in input().split()]
    ls = [0, 0, 0]
    for i in arr:
        ls[i] += 1
    ans = '0 '*ls[0] + '1 '*ls[1] + '2 '*ls[2]
    print(ans)
