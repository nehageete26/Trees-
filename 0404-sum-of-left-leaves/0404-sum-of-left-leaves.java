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
    int left_sum = 0;
    boolean isLeaf(TreeNode root){
        if(root == null) return false;
        if(root.left == null && root.right == null) return true;
        else return false;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        checkleftleaf(root);
        return left_sum;
    }
    void checkleftleaf(TreeNode root){
         if(root == null) return;
         if(isLeaf(root.left)) left_sum += root.left.val;
         checkleftleaf(root.left);
         checkleftleaf(root.right);
    }
}