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
    int max = 0;
    int depth = 0;
    public int maxDepth(TreeNode root) {
        if(root != null && root.left != null){
            //root = root.left;
            depth++;
            max = max < depth ? depth : max;
            maxDepth(root.left);
            depth--;
        }
        if(root != null && root.right != null){
            //root = root.right;
            depth++;
            max = max < depth ? depth : max;
            maxDepth(root.right);
            depth--;
        }
        if(root == null){
            return max;
        }
        else return max + 1;
    }
}