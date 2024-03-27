public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        int parentValue = root.val;
        int pValue = p.val;
        int qValue = q.val;

        if (pValue > parentValue && qValue > parentValue)
        {
            return lowestCommonAncestor(root.right, p, q);
        }
        else if (pValue < parentValue && qValue < parentValue)
        {
            return lowestCommonAncestor(root.left, p, q);
        }
        else
        {
            return root;
        }
    }
}