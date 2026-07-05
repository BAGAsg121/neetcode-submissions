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

    public int maxPathSum(TreeNode root) {

        // Create an array of size 1.
        // This acts like a shared variable that every recursive call can update.
        int[] maxValue = new int[1];

        // Initialize it to the smallest possible integer.
        // This is important because the tree may contain only negative values.
        maxValue[0] = Integer.MIN_VALUE;

        // Start the recursive DFS traversal.
        maxPathDown(root, maxValue);

        // The answer is stored inside maxValue[0].
        return maxValue[0];
    }

    private int maxPathDown(TreeNode node, int[] maxValue) {

        // Base Case:
        // If there is no node, its contribution is 0.
        if (node == null) {
            return 0;
        }

        // Recursively calculate the best path from the left subtree.
        // If the result is negative, ignore it by taking 0.
        int left = Math.max(0, maxPathDown(node.left, maxValue));

        // Recursively calculate the best path from the right subtree.
        // Again, ignore negative paths.
        int right = Math.max(0, maxPathDown(node.right, maxValue));

        // Check if the best path passes THROUGH this node.
        // This path can include:
        // Left subtree + Current Node + Right subtree
        maxValue[0] = Math.max(maxValue[0], left + right + node.val);

        // Return the best single branch to the parent.
        // We cannot return both left and right because a path cannot split.
        return Math.max(left, right) + node.val;
    }
}
