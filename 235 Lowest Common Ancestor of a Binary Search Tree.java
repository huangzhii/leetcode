/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null || p == null || q == null){
            return null;
        }
        
        if(Math.max(p.val, q.val) < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(Math.min(p.val, q.val) > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}