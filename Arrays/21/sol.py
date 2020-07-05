def func(a):
    a = a[::-1]
    total = len(a)
    for i in range(total):
        if a[i] == '1':
            return total - i - 1
    return -1


for t in range(int(input())):
    a = input()
    print(func(a))
