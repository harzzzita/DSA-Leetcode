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
    public int widthOfBinaryTree(TreeNode root) {
     
        Queue <TreeNode> q = new LinkedList <>() ;
        Queue<Long> index = new LinkedList<>() ;
        if(root == null) return 0 ;
        q.add(root) ;
        index.add(0L) ;
         long maxWidth = 0;

        while(!q.isEmpty()){
            int size = q.size() ;
            long min = index.peek() ;
            long first = 0 , last = 0 ;
            for(int i = 0 ; i<size ; i++){
                TreeNode curr = q.poll() ;
                long idx = index.poll()-min ;
                if(i==0) first = idx ;
                if(i == size-1) last = idx ;

                if(curr.left != null) {
                    q.add(curr.left) ;
                    index.add(2*idx+1) ;
                }
                if(curr.right != null){
                    q.add(curr.right) ;
                    index.add(2*idx+2) ;
                }
            }
            maxWidth = Math.max(maxWidth , last-first+1) ;

        }
        
        return  (int) maxWidth ;
    }
}