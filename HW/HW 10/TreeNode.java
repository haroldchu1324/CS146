import java.util.*;
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
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> complete = new ArrayList<>();
        if (root == null)
        {
            return complete;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty())
        {
            int level = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < level; i++)
            {
                TreeNode node = queue.poll();
                currentLevel.add(node.val);
                if (node.left != null)
                {
                    queue.offer(node.left);
                }
                if (node.right != null)
                {
                    queue.offer(node.right);
                }
            }
            complete.add(currentLevel);
        }
        return complete;

    }

}
