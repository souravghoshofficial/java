import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            buildPaths(root, "", result);
        }
        return result;
    }

    private void buildPaths(TreeNode node, String path, List<String> result) {
        if (node.left == null && node.right == null) {
            result.add(path + node.val);
        }
        if (node.left != null) {
            buildPaths(node.left, path + node.val + "->", result);
        }
        if (node.right != null) {
            buildPaths(node.right, path + node.val + "->", result);
        }
    }

    public static void main(String[] args) {
        BinaryTreePaths bt = new BinaryTreePaths();
        TreeNode root = bt.new TreeNode(1);
        root.left = bt.new TreeNode(2);
        root.right = bt.new TreeNode(3);
        root.left.right = bt.new TreeNode(5);

        List<String> paths = bt.binaryTreePaths(root);
        System.out.println(paths);
    }
}
