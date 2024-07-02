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
    int maxs=0;
    int maxl=0;
    public int deepestLeavesSum(TreeNode root) {
        solve(root,0);
        return maxs;
    }
    public void solve(TreeNode root,int l){
        if(root==null) {
            return ;
        }
        if(root.left==null && root.right==null){
            if(maxl<l){
                maxl=l;
                maxs=root.val;
            }
            else if(maxl==l){
                maxs+=root.val;
            }
        }
        solve(root.left,l+1);
        solve(root.right,l+1);
        return ;
    }
}