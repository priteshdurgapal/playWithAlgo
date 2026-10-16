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
    public boolean isValidBST(TreeNode root) {

        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;

        return dfs(root,minVal,maxVal);
        
    }

    private boolean dfs(TreeNode node, int minVal, int maxVal) {
        if(node==null) {
            return true;
        }
        if(!(node.val>minVal && node.val<maxVal)) return false;
        return dfs(node.left, minVal, node.val) && 
                dfs(node.right,node.val,maxVal);

    }
}


