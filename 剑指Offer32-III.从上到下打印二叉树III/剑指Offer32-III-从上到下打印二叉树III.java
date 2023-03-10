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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        List<Integer> layer = new LinkedList<Integer>();
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();          
            for (int i = 0; i < size; i ++) {  
                TreeNode node = queue.poll();
                layer.add(node.val);                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }                
            }
            if (level % 2 == 1) {
                Collections.reverse(layer);
            }
            res.add(layer);
            layer = new LinkedList<Integer>();
            level ++;
        }
        return res;
    }
}