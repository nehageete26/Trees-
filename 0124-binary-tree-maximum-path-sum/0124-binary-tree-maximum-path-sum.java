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
    int maxi = Integer.MIN_VALUE;
    int maxpath(TreeNode root){
        if(root == null) return 0;
        int leftsum = Math.max(0,maxpath(root.left));
        int rightsum = Math.max(0,maxpath(root.right));
        maxi = Math.max(maxi , leftsum+rightsum+root.val);
        return root.val+Math.max(leftsum , rightsum);
    }
    public int maxPathSum(TreeNode root) {
        maxpath(root);
        return maxi;
    }
}