/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class BT_LevelOrder {
    public void traversal_recursion (TreeNode root, int level, List<List<Integer>> fin){

        if (root != null && fin.size() < level){
            fin.add(0, new ArrayList<>());
        }
        fin.get(fin.size() - level).add(root.val);

        if (root.left != null){
            traversal_recursion(root.left, level + 1, fin);
        }
        if (root.right != null){
            traversal_recursion(root.right, level + 1, fin);
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> fin = new ArrayList<>();
        if (root == null){
            return fin;
        }
        traversal_recursion (root, 1, fin);
        return fin;
    }

    public void print_tree(TreeNode root){

        if (root==null){
//            System.out.println("null");
            return;
        }
        System.out.println(root.val);
        print_tree(root.left);
        print_tree(root.right);
    }
}


public class BinaryTree_LevelOrderTraversal {
    public static void main(String [] args){
        BT_LevelOrder obj1 = new BT_LevelOrder();
        TreeNode leaf1 = new TreeNode(15, null, null);
        TreeNode leaf2 = new TreeNode(7, null, null);
        TreeNode node2a = new TreeNode(9, null, null);
        TreeNode node2b = new TreeNode(20, leaf1, leaf2);
        TreeNode root = new TreeNode(3, node2a, node2b);

        List<List<Integer>> result = obj1.levelOrderBottom(root);
        obj1.print_tree(root);
        System.out.println(result);

    }
}
