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
    ArrayList<Integer> list = new ArrayList<>();
    void preorder(TreeNode root,int level){
        if(root == null) return;
        if(level == list.size()) list.add(root.val);
            preorder(root.right,level+1);
            preorder(root.left,level+1);
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        int level = 0;
        preorder(root,level);
        return list;
    }
}