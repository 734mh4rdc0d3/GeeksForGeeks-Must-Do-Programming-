'''
    lis[][0]:Petrol
    lis[][1]:Distance
'''
#Your task isto complete this function
#Your function should return the starting point
def tour(lis, n):
    start =0
    total = len(lis)
    end = 1 % total
    petrol_left = lis[start][0] - lis[start][1]
    while start != end or petrol_left < 0 :
        while petrol_left < 0 and end != start:
            petrol_left -= lis[start][0] - lis[start][1]
            start = (start + 1)%total
            if start == 0:
                return -1
        petrol_left += lis[end][0] - lis[end][1]
        end = (end + 1)%total
    return start
    #Code here



#{ 
#  Driver Code Starts
if __name__ == '__main__': 
    t = int(input())
    for i in range(t):
        n = int(input())
        arr=list(map(int, input().strip().split()))
        lis=[]
        for i in range(1, 2*n, 2):
            lis.append([ arr[i-1], arr[i] ])
        print(tour(lis, n))
    # Contributed by: Harshit Sidhwa
# } Driver Code Ends