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
    HashMap<Integer,Integer> indx = new HashMap<>();
    int pre_in = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i< inorder.length;i++) {
            indx.put(inorder[i],i);
        } //1,2,3,4  in-> 2,1,3,4
        return dfs(preorder,0,inorder.length-1);
        
    }

    private TreeNode dfs(int[] preorder, int l,int r) {
        if (l>r) return null;
        int root_val = preorder[pre_in++];
        TreeNode root = new TreeNode(root_val);
        int mid = indx.get(root_val);
        root.left = dfs(preorder,l,mid-1);
        root.right = dfs(preorder,mid+1,r);
        return root;
    }
}
