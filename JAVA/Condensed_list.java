import java.util.*;

class Node{
    int val;
    Node next;

    Node(int x, Node new_node){
        this.val = x;
        this.next = new_node;
    }

}
public class Condensed_list {
    static Node cleared_list(Node root){
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        Node beg = root;
        while(root!=null){
            if (root.next!=null && map.containsKey(root.next.val) == true){
//                System.out.println(root.next.val);
                root.next = root.next.next;
            }
            else{
                map.put(root.val, true);
            }
            root = root.next;
        }
        return beg;
    }
    public static void main(String [] args){

        Node last = new Node(6, null);
        Node n1 = new Node(3, last);
        Node n2 = new Node(4, n1);
        Node start = new Node(3, n2);

        Node result = cleared_list(start);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
