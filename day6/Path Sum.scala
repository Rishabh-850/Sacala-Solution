object Solution {
    def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
        if (root == null) return false
        if (root.left == null && root.right == null && root.value == targetSum) return true
        hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum - root.value)
    }
}
