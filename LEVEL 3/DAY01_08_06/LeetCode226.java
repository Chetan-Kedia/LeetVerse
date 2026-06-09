// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {

        // Base case: if node is null, nothing to invert
        if (root == null) return null;

        // VISIT: swap left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // RECURSE: invert subtrees
        invertTree(root.left);
        invertTree(root.right);

        // Return the root after inversion
        return root;
    }
}
