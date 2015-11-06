/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
Recursion Solution. Trivia.
 
public class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return list;
        list.add(root.val);
        if (root.left != null){
            preorderTraversal(root.left);
        }
        if (root.right != null){
            preorderTraversal(root.right);
        }
        return list;
    }
}

*/

//Iterative solution
public class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return list;
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode current = stack.pop();
            list.add(current.val);
            if (current.right != null){
                stack.push(current.right);
            }
            if (current.left != null){
                stack.push(current.left);
            }
        }
        return list;
    }
}