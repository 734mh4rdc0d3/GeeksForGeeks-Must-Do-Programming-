for t in range(int(input())):
    word = input()
    size = len(word)
    arr = []
    max_len = 1
    r = 0
    c = 0
    for i in range(size):
        arr.append([0]*(size))
    start = 0
    for i in range(size):
        arr[i][i] = 1
    for i in range(1,size):
        if word[i-1] == word[i]:
            arr[i-1][i] = 1
            if max_len < 2:
                max_len = 2
                start  = i-1
    for i in range(3, size+1):
        for k in range(size - i+1):
            if (word[k] == word[k+i-1]) and (arr[k+1][k+i-2]==1):
                arr[k][k+i-1] = 1
                if max_len < i:
                    max_len = i
                    start = k
    print(word[start: start+max_len])
