class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            int curr = root.val;

            if (p.val > curr && q.val > curr) {
                root = root.right;
            } 
            else if (p.val < curr && q.val < curr) {
                root = root.left;
            } 
            else {
                return root;
            }
        }
        return null;
    }
}
