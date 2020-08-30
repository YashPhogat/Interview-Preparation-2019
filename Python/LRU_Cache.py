class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

main_dict = {}

def set_val(num):
    if num in main_dict:
        work_node = main_dict[num]


root = Node(1)