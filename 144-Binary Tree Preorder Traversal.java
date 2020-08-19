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
    // Recursive
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversalTree(res, root);
        return res;
    }

    public void traversalTree(List<Integer> res, TreeNode curr) {
        if (curr != null) {
            res.add(curr.val);
            traversalTree(res, curr.left);
            traversalTree(res, curr.right);
        }
    }
}
