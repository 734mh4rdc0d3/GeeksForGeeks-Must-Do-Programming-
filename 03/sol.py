def sumArray(arr):
    size = len(arr)
    total_sum = arr[0]
    temp_sum = arr[0]
    for i in range(1, size):
        temp_sum = max(temp_sum + arr[i], arr[i])
        total_sum = max(total_sum, temp_sum)
    return total_sum



for test in range(int(input())):
    size = int(input())
    arr = [int(x) for x in input().split()]
    print(sumArray(arr))