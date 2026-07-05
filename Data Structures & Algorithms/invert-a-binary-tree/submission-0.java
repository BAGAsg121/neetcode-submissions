class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // Swap left and right children
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            // Add children to queue to process next level
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return root; // return the modified root
    }
}