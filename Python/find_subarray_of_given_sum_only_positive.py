# Given an array find the subarray with a given sum value k

array = [23, 24, 3, 4, 10, 15]

k = 24

def find_sum(arr, k):
    right_pointer = 0
    left_pointer = 0
    sum1 = arr[0]
    while left_pointer <= right_pointer and right_pointer <= len(arr):
        # print(sum1, " = ")
        if sum1 == k:

            print("Answer:", left_pointer, right_pointer)
            return True
        elif sum1 < k:
            right_pointer+=1
            if right_pointer+1> len(arr):
                return False
            sum1 += arr[right_pointer]
        elif sum1 > k:
            sum1 -= arr[left_pointer]
            left_pointer +=1

    return False

if not find_sum(array, k):
    print("Sum not found")