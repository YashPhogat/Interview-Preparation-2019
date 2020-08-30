# GIVEN A STREAM of N numbers, determine the median every time a new character gets in

import heapq
N = int(input("Enter N: "))
list1 = []
list2 = []
x = int(input())
median = []
median.append(x)
list1.append(-1*x)
x = int(input())
median.append((median[0]+x)//2)
list2.append(x)

heapq.heapify(list1)
heapq.heapify(list2)
right_push = False
left_push = True
for i in range(2, N):
    x = int(input())
    # print(x, "ye le")
    if left_push == True :
        heapq.heappush(list1, -x)
        left_push = False
        right_push = True
    elif right_push == True :
        heapq.heappush(list2, x)
        right_push = False
        left_push = True

    left_max = -1*heapq.heappop(list1)
    # print(left_max, "jkbjhg")
    right_min = heapq.heappop(list2)
    # print(right_min,"---")
    heapq.heappush(list1, -left_max)
    heapq.heappush(list2, right_min)
    if len(list1) == len(list2):

        median.append((left_max+right_min)/2)
    elif len(list1) > len(list2):
        median.append(left_max)

    elif len(list1) < len(list2):
        median.append(right_min)


print(median)