for t in range(int(input())):
    word = input()
    wors = input()
    l = len(word)
    c1 = word[2:]+word[:2]
    c2 = word[l-2:]+word[:l-2]
    if wors == c1 or wors == c2:
        print(1)
    else:
        print(0)
