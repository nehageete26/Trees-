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
    boolean isleaf(TreeNode root){
        if(root == null) return false;
        if(root.left == null && root.right == null) return true;
        else return false;
    }
    boolean has_sum(TreeNode root, int targetSum, int sum){
        if(root == null) return false;
        sum += root.val;
        if(isleaf(root)){
        if(sum == targetSum) return true;
        else return false;
        }
        
        boolean left_sum = has_sum(root.left,targetSum,sum);
        boolean right_sum = has_sum(root.right,targetSum,sum);
        return left_sum || right_sum;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
           return has_sum(root,targetSum,0);
    }
}