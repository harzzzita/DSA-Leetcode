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
    public int diameterOfBinaryTree(TreeNode root) {
        int [] diamater = new int [1] ;
        helper(root , diamater) ;
        return diamater[0] ;
    }
    private int helper (TreeNode root , int [] diamater){
        if(root==null) return 0 ;
        int left = helper(root.left , diamater) ;
        int right = helper(root.right , diamater) ;
        diamater[0] = Math.max(diamater[0] , left+right) ;
        return 1+Math.max(left , right) ;
    }
}