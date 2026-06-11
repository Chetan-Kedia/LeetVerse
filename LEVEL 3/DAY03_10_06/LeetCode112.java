class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }
    private boolean dfs(TreeNode node, int currSum, int targetSum) {
        if (node == null) {
            return false;
        }
        currSum += node.val;
        if (node.left == null && node.right == null) {
            return currSum == targetSum;
        }
        return dfs(node.left, currSum, targetSum)
            || dfs(node.right, currSum, targetSum);
    }
}
