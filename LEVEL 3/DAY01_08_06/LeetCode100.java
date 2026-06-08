// Approach 1: Recursive DFS
// Time: O(N) | Space: O(H) — H = height of tree

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Base case: both null → identical subtrees
        if (p == null && q == null) return true;

        // One null, one not → structurally different
        if (p == null || q == null) return false;

        // Values differ → not same. Recurse left and right subtrees.
        return (p.val == q.val)
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
