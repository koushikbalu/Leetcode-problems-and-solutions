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
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        calculate(root);

        return max;
        
    }

    public int calculate(TreeNode root){
        if(root == null) return 0;

        int left = calculate(root.left);
        int right = calculate(root.right);

        max = Integer.max(max, left + right);

        return 1 + Math.max(left, right);
    }
}