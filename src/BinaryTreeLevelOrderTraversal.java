import Util.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
           int count = queue.size();
           List<Integer> row = new ArrayList<>();
           for (int i = 0; i < count; i++) {
               TreeNode node = queue.remove();
               row.add(node.val);
               if(node.left != null) {
                   queue.add(node.left);
               }
               if(node.right != null) {
                   queue.add(node.right);
               }
           }
           result.add(row);
        }
        return result;
    }
}
