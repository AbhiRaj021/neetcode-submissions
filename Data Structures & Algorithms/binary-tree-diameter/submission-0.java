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
    // use a variable to track the max diameter found during recursion
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);

        return maxDiameter;
    }

    private int calculateHeight(TreeNode node) {

        if(node == null) return 0;

        // Recursively find height of left and right subtree
        int leftNode = calculateHeight(node.left);
        int rightNode = calculateHeight(node.right);

        // Update global max diameter if path through THis node is longer
        maxDiameter = Math.max(maxDiameter, leftNode + rightNode);

        // Return the height of this node to its parents
        return Math.max(leftNode, rightNode) + 1;
    }
}
