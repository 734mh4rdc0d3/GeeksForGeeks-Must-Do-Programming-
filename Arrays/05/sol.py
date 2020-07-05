# Time limit exceeded error in this solution

def mergeArr(arr1, arr2):
    size1, size2 = len(arr1), len(arr2)
    buff = (size1 + size2)//2
    while buff > 0:
        i1 = 0
        p1 = 0
        p2 = 0
        while (i1 + buff < size1 + size2):
            if i1 >= size1:
                p1 = i1 - size1
                p2 = i1 + buff - size1
                if arr2[p1] > arr2[p1]:
                    arr2[p1],arr2[p2] = arr2[p2], arr2[p1]
            elif i1 + buff >= size1:
                p1 = i1
                p2 = i1 + buff - size1
                if arr1[p1] > arr2[p2]:
                    arr1[p1], arr2[p2] = arr2[p2], arr1[p1]
            else:
                p1 = i1
                p2 = i1 + buff
                if arr1[p1] > arr1[p2]:
                    arr1[p1],arr1[p2] = arr1[p2],arr1[p1]
            i1 += 1
        if buff == 1:
            break
        buff = buff // 2
    for i in arr1:
        print(i, ' ', end='')
    for i in arr2:
        print(i, ' ', end="")
    return


for test in range(int(input())):
    buff = input()
    arr1 = [int(x) for x in input().split()]
    arr2 = [int(x) for x in input().split()]
    mergeArr(arr1,arr2)
    print()