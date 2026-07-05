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

    public List<Integer> preorderTraversal(TreeNode root) {

        // This list will store our final preorder traversal.
        List<Integer> preorder = new ArrayList<>();

        // Edge Case:
        // If the tree is empty, simply return an empty list.
        if (root == null) {
            return preorder;
        }

        // Stack stores TreeNode objects.
        // We use a stack because preorder is Depth First Search (DFS).
        Stack<TreeNode> stack = new Stack<>();

        // Initially only the root exists.
        stack.push(root);

        // Continue until there are no nodes left to visit.
        while (!stack.isEmpty()) {

            // Remove the top node from the stack.
            // This becomes our current node.
            TreeNode node = stack.pop();

            // Visit the current node.
            // Preorder always visits the root first.
            preorder.add(node.val);

            // -------------------------------------------------
            // VERY IMPORTANT
            // Push RIGHT child first.
            //
            // Why?
            //
            // Stack is LIFO (Last In First Out).
            //
            // If we push Left first and then Right,
            // Right will come out first.
            //
            // But preorder wants:
            //
            // Root -> Left -> Right
            //
            // Therefore we push Right first,
            // then Left.
            // -------------------------------------------------

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }

        // Return the preorder traversal.
        return preorder;
    }
}