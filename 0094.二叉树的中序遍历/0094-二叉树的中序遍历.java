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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<TreeNode>();
        List<Integer> ans = new ArrayList<Integer>();
        TreeNode curr = root;
        while (curr != null || !nodes.isEmpty()) {
            while (curr != null) {
                nodes.push(curr);
                curr = curr.left;
            }
            curr = nodes.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
        return ans;
    }
}