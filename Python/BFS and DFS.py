class Node :

    def __init__(self, key) :
        self.data = key
        self.left = None
        self.right = None


queue = []


def print_bfs(node) :
    # curr_node = node
    queue.append(node)
    while len(queue) > 0 :

        # curr_node = queue.pop(0)  #BFS
        curr_node = queue.pop(-1)  # DFS
        if curr_node :
            print(curr_node.data)
            queue.append(curr_node.right)
            queue.append(curr_node.left)


root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)
root.left.left.left = Node(8)
# max_depth = 0
print_bfs(root)
