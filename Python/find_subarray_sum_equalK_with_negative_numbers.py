# Given an array with positive and negative numbers, find if there is a
# subarray that adds up to a given sum of k



# This will be done using HashMap. At every iteration from 0 to lengtn of the array add the current sum to a hashmap as key
# and at every iteration, check if current sum - k is present in the hashmap. If yes then we can say that adding current value
# will give k along with some previous sum value

array = [23, 24, 3, 4, 10, 15]

k =25

sum_dict = {}
def find_k_sum(arr, k):
    sum1 = 0
    # sum_dict[sum1] = 0
    for iter in range(0, len(arr)):
        sum1 += arr[iter]

        if sum1 == k :
            print("Answer: ", 0, iter)
            return True
        if sum1-k in sum_dict.keys():
            print("Answer: ", sum_dict[sum1-k]+1,iter)
            return True
        sum_dict[sum1] = iter
    return False

if not find_k_sum(array, k):
    print("Sum not Found")