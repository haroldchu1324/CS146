class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def invertTree(self, root):
        if root is None:
            return None

        root.left, root.right = self.invertTree(root.right), self.invertTree(root.left)
        return root
