class Solution {
    int diameter = 0; // global variable to track max diameter seen

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;

        int left = depth(node.left);   // depth of left subtree
        int right = depth(node.right); // depth of right subtree

        // at this node, diameter candidate = left + right
        diameter = Math.max(diameter, left + right);

        // return depth to parent (pick deeper side + 1 for self)
        return Math.max(left, right) + 1;
    }
}