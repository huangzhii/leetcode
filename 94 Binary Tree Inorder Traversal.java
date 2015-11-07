/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// Recursion is trivia. Use iteration.
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while (!(stack.empty() && current == null)){
            
            if (current != null){
                stack.push(current);
                current = current.left;
            }
            else {
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }
        }
        return list;
    }
}