/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkSym(root.left, root.right);
    }

    private boolean checkSym(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;      
        }       
        if (left == null || right == null) {
            return false;
        }   
        if (left.val != right.val) {
            return false;      
        }
        return checkSym(left.left, right.right) && checkSym(left.right, right.left);
    }
}