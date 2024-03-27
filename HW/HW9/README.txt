The method, TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) will take in the root,
p, and q node as parameters. We will compare the root value, with the p and q value to see if they are
both higher than the root value or both less than the root value. If both are higher, it means that
they are both in the tree of the right child of the root. Hence we will call the method lowestCommonAncestor
again recursively. If they are both lower then we will use the left child of the root. When the root is
equal to the value of p or q, or if p and q are on each side of the root, we will return the root.