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
    public TreeNode invertTree(TreeNode root) {
        
        // base case if tree is empty
        if(root == null) return null;

        // swap left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //Recursive call
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
