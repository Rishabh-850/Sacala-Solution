object Solution {
    def maxDepth(root: TreeNode): Int = {
        if(root==null) return 0;
        var l=maxDepth(root.left);
        var r=maxDepth(root.right);
        1+ l.max(r)
    }
}
