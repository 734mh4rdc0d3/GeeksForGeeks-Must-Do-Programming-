import functools
def my_cmp(a,b):
    return int(b+a) - int(a+b)
for t in range(int(input())):
    size = int(input())
    ls = input().split()
    ls = sorted(ls, key=functools.cmp_to_key(my_cmp))
    print("".join(ls))
    