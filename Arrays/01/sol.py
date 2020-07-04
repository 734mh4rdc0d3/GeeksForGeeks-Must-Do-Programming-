def func(arr, sums):
    size = len(arr)
    low = 0
    high = 0
    total = arr[0]
    while high < size and low < size:
        if total == sums:
            break
        elif total > sums:
            total -= arr[low]
            low += 1
            if low == size:
                break
            if(low > high):

                total = arr[low]
                high = low
        else:
            high += 1
            if high == size:
                break
            total += arr[high]
        # print(total,low,high)
    if total == sums:
        return str(low + 1)+" " + str(high + 1)
    return "-1"


for test in range(int(input())):
    size, sums = map(int, input().split())
    arr = [int(x) for x in input().split()]
    print(func(arr, sums))
