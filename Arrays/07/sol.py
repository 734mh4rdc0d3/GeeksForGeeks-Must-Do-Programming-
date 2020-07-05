def greaterThan(arr, val):
    low = 0
    total = len(arr)
    high = total - 1
    mid = 0
    res = total
    while  low <= high:
        mid = low + (high - low)//2
        if arr[mid] > val:
            res = mid 
            high = mid - 1
        else:
            low = mid + 1
    return total - res
def getTotal(arr1, arr2):
    arr1.sort()
    arr2.sort()
    #arr_1 = []
    arr_2 = []
    total = 0
    for i in range(4):
        #arr_1.append(arr1.count(i))
        arr_2.append(arr2.count(i))
    #print(arr_2)
    for i in arr1:
        #print(total)
        if i == 0:
            total += 0
        elif i == 1:
            total = total  + arr_2[0]
        elif i == 2:
            total = total + arr_2[0] + arr_2[1] + greaterThan(arr2,4)
        elif i == 3:
            total = total + arr_2[0] + arr_2[1] + arr_2[2] + greaterThan(arr2, i)
        elif i == 4:
            total = total + arr_2[0] + arr_2[1] + greaterThan(arr2, i)
        else:
            total = total + arr_2[0] + arr_2[1] + greaterThan(arr2, i)
    return total




for test in range(int(input())):
    buff = input()
    arr1 = [int(x) for x in input().split()]
    arr2 = [int(x) for x in input().split()]
    print(getTotal(arr1,arr2))
