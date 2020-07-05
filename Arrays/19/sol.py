def func(ls):
    max_left = ls[0]
    left_arr = [max_left]
    size = len(ls)
    for i in range(1, size):
        if max_left < ls[i]:
            max_left = ls[i]
        left_arr.append(max_left)
    min_right = ls[-1]
    right_arr = [min_right]
    for i in range(size-2, -1, -1):
        if min_right > ls[i]:
            min_right = ls[i]
        right_arr.append(min_right)
    right_arr = right_arr[::-1]
    # print(left_arr)
    # print(ls)
    # print(right_arr)
    for i in range(1, size-1):
        if ls[i] >= left_arr[i-1] and ls[i] <= right_arr[i+1]:
            return ls[i]
    return -1


for t in range(int(input())):
    size = int(input())
    ls = [int(x) for x in input().split()]
    print(func(ls))
