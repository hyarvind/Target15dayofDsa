class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    public boolean search(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (root.val == k) {
            return true;
        }
        if (k < root.val) {
            return search(root.left, k);
        }
        return search(root.right, k);
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);
        
        int k = 40;
        boolean result = bst.search(bst.root, k);
        
        if (result) {
            System.out.println("Value " + k + " exists in the BST.");
        } else {
            System.out.println("Value " + k + " does not exist in the BST.");
        }
    }
}
