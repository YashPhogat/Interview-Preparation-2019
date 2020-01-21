sorting_list = [12, 13, 1, 4, 3, 8, 2]
final_list = [-1]* len(sorting_list)
def merge(list1, list2):
    # print(list1, list2)
    i = 0
    j = 0
    k = 0
    print(list1, list2, "::::", final_list)
    while i < len(list1) and j < len(list2):
        if list1[i] < list2[j]:
            final_list[k] = list1[i]
            i += 1
        else:
            final_list[k] = list2[j]
            j += 1
        k+=1
    while i < len(list1):
        final_list[k] = list1[i]
        i+=1
        k+=1
    while j < len(list2) :
        final_list[k] = list2[j]
        j += 1
        k += 1

def merge_sort(list):
    # print(left, right)
    if len(list)>1:
        mid = len(list) // 2
        Lhs = list[:mid]

        Rhs = list[mid:]
        merge_sort(Lhs)
        merge_sort(Rhs)
        list1 = Lhs
        list2 = Rhs
        # print(left, right, Lhs, Rhs)
        i = 0
        j = 0
        k = 0
        # print(list1, list2, "::::", final_list)
        while i < len(list1) and j < len(list2) :
            if list1[i] < list2[j] :
                list[k] = list1[i]
                i += 1
            else :
                list[k] = list2[j]
                j += 1
            k += 1
        while i < len(list1) :
            list[k] = list1[i]
            i += 1
            k += 1
        while j < len(list2) :
            list[k] = list2[j]
            j += 1
            k += 1
    # else:
    #     # print(left, right, list)
    #     return list


merge_sort(sorting_list)

print(sorting_list)