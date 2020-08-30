sorting_list = [12, 13, 1, 4, 3, 8, 2]

#insertion sort
# We traverse the sort list and if some element id found at the wrong position then we place it at its best position
insert_flag = False
for pointer1 in range(len(sorting_list)-1):
    if sorting_list[pointer1] > sorting_list[pointer1 + 1]:
        for pointer2 in range(len(sorting_list)):
            if insert_flag:
                
            if sorting_list[pointer1] < sorting_list[pointer2]:


