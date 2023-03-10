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
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int num) {
        //Null node
        if (node == null) {
            return 0;
        }
        num = 10 * num + node.val;
        //Leaf node
        if (node.left == null && node.right == null) {
            return num;
        }
        //Other occasions
        return dfs(node.left, num) + dfs(node.right, num);
    }
}