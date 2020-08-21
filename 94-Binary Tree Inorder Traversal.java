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
class Solution {
    // Iterative
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> res = new ArrayList<>();
       Stack<TreeNode> s = new Stack<>();
       TreeNode curr = root;
       while (!s.isEmpty() || curr != null) {
           while (curr != null) {
               res.add(curr.val);
               s.push(curr);
               curr = curr.left;
           }
           curr = s.pop();
           curr = curr.right;
       }
       return res;
   }
    // Recursive
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> res = new ArrayList<>();
    //     traveralHelper(root, res);
    //     return res;
    // }
    //
    // public void traveralHelper(TreeNode root, List<Integer> res) {
    //     if (root != null) {
    //         if (root.left != null) {
    //             traveralHelper(root.left, res);
    //         }
    //         res.add(root.val);
    //         if (root.right != null) {
    //             traveralHelper(root.right, res);
    //         }
    //     }
    // }
}
