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
    boolean isSame = true;
    //int a = 0;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null){
            //System.out.println(a++ + " a");
            if (p.val == q.val){
                isSame &= isSameTree(p.left, q.left);
                isSame &= isSameTree(p.right, q.right);
            }
            else return false;
        }
        else if (p == null && q == null) return true;
        else if (p != null && q == null){
            //System.out.println(a++ + " b");
            return false;
        }
        else if (p == null && q != null){
            //System.out.println(a++ + " c");
            return false;
        }
        return isSame;
    }
}