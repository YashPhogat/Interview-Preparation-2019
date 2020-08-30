arr = [0, -1, 2, -3, 1]
n = len(arr)


def findTriplets(array, len):
    array.sort()
    for i in range(0, len - 2):
        left = i + 1
        right = len - 1
        current_val = array[i]
        while left < right:
            if current_val + array[left] + array[right] == 0:
                print("Sol:", current_val, array[left], array[right])
                left += 1
                right -= 1
            elif current_val + array[left] + array[right] < 0:
                left += 1
            elif current_val + array[left] + array[right] > 0:
                right -= 1


findTriplets(arr, n)
