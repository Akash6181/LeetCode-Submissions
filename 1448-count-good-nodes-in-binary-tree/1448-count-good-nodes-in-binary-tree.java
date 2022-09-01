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
    public int goodNodes(TreeNode root) {
        int max = Integer.MIN_VALUE;
        return sol(root,max);
    }
    
    public int sol(TreeNode root,int max){
        if(root==null) return 0;
        boolean flag=false;
        if(root.val>=max){
            max=root.val;
            flag=true;
        }
        int left=0,right=0;
        left+=sol(root.left,max);
        right+=sol(root.right,max);
        if(flag) return 1+left+right;
        else return left+right;
         
    }
}