def getWater(ls):
    max_left = -1
    left_arr = []
    for i in ls:
        if i > max_left:
            max_left = i
        left_arr.append(max_left)
    max_right = -1
    right_arr = []
    for i in range(len(ls)-1, -1, -1):
        if ls[i] > max_right:
            max_right = ls[i]
        right_arr.append(max_right)
    right_arr = right_arr[::-1]
    total = 0

    # print(left_arr,right_arr)
    for i in range(len(ls)):
        total += min(right_arr[i], left_arr[i]) - ls[i]
    print(total)
    return


for t in range(int(input())):
    size = int(input())
    ls = [int(x) for x in input().split()]
    getWater(ls)
