object Solution {
  def isSymmetric(root: TreeNode): Boolean = {
    def isMirror(left: TreeNode, right: TreeNode): Boolean = {
      (left, right) match {
        case (null, null) => true
        case (_, null) | (null, _) => false
        case (left, right) => left.value == right.value && isMirror(left.left, right.right) && isMirror(left.right, right.left)
      }

    }

    if (root == null) true else isMirror(root.left, root.right)
  }
}
