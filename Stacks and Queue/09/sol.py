def getUp(ls,row,col):
    return max(0,ls[0] -1),ls[1]
def getDown(ls,row,col):
    return min(row-1,ls[0] +1),ls[1]
def getLeft(ls,row,col):
    return ls[0],max(0,ls[1]-1)
def getRight(ls,row,col):
    return ls[0], min(col-1,ls[1]+1)
for t in range(int(input())):
    row, col = map(int, input().split())
    ls = [int(x) for x in input().split()]
    arr = []
    for i in range(row):
        arr.append([])
    myQueue = []
    fresh = 0
    for i in range(row):
        for j in range(col):
            arr[i].append(ls[i * col + j])
            if arr[i][j] == 2:
                myQueue.append([i,j])
            elif arr[i][j] == 1:
                fresh += 1
    days = 0
    while fresh > 0:
        flag = True
        nextQueue = []
        for i in myQueue:
            r,c = getLeft(i,row, col)
            if(arr[r][c]==1):
                fresh -= 1
                arr[r][c] = 2
                flag = False
                nextQueue.append([r,c])
            r,c = getRight(i, row, col)
            if(arr[r][c]==1):
                fresh -= 1
                arr[r][c] = 2
                flag = False
                nextQueue.append([r,c])
            r,c = getUp(i, row, col)
            if(arr[r][c]==1):
                arr[r][c] = 2
                fresh -= 1
                flag = False
                nextQueue.append([r,c])
            r,c = getDown(i, row, col)
            if(arr[r][c]==1):
                arr[r][c] = 2
                fresh -= 1
                flag = False
                nextQueue.append([r,c])
        myQueue = nextQueue
        if flag:
            break
        else:
            days += 1
        
    if fresh == 0:
        print(days)
    else:
        print(-1)
