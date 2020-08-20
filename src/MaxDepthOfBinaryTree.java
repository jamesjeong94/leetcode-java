import Util.TreeNode;

public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return traverse(root, 1);
    }
    public static int traverse(TreeNode node, int depth) {
        if (node == null) {
            return depth - 1;
        }
        if (node.left == null && node.right == null) {
            return depth;
        }
        return Math.max(traverse(node.left, depth+1), traverse(node.right, depth+1));
    }
}

