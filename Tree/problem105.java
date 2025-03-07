public class Problem105 {
    private int preIndex = 0;

    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preIndex++]);

        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
                break;
            }
        }

        root.left = buildTreeHelper(preorder, inorder, inStart, inIndex - 1);
        root.right = buildTreeHelper(preorder, inorder, inIndex + 1, inEnd);

        return root;
    }


    public static void main(String[] args) {
        Problem105 solution = new Problem105();
        
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        
        TreeNode root = solution.buildTree(preorder, inorder);
        
        printTree(root);
    }

    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }
}
