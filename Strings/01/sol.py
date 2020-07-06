for t in range(int(input())):
    sentence = input().split('.')
    sentence = sentence[::-1]
    print('.'.join(sentence))
