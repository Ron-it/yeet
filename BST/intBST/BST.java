public class BST {
    private BinaryNode root;

    public BinaryNode getRoot() {
        return this.root;
    }

    public void setRoot(BinaryNode root) {
        this.root = root;
    }

    // public BST(BinaryNode root) { this.root = root; }

    public BST(int root) {
        this.root = new BinaryNode(root);
        System.out.println("BST created with " + root + " as its root.");
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void add(BinaryNode node, BinaryNode newNode) {
        if (newNode.getData() < node.getData()) {
            if (node.getLeft() != null)
                add(node.getLeft(), newNode);
            else {
                node.setLeft(newNode);
                System.out.println(newNode + " added to the left of " + node);
            }
        } else if (newNode.getData() > node.getData()) {
            if (node.getRight() != null)
                add(node.getRight(), newNode);
            else {
                node.setRight(newNode);
                System.out.println(newNode + " added to the right of " + node);
            }
        }
    }

    public void add(int data) {
        BinaryNode n = new BinaryNode(data);
        add(this.root, n);
    }

    public boolean search(int data) {
        return search(this.root, data);
    }

    private boolean search(BinaryNode node, int data) {
        if (node == null) {
            return false;
        }
        if (data == node.data) {
            return true;
        } else if (data < node.data) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    public void inOrder(BinaryNode node) {
        if (node.getLeft() != null)
            inOrder(node.getLeft());
        System.out.print(node + " ");
        if (node.getRight() != null)
            inOrder(node.getRight());
    }

    public void postOrder(BinaryNode node) {
        if (node.getLeft() != null) {
            postOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            postOrder(node.getRight());
        }
        System.out.print(node + " ");
    }

    public void preOrder(BinaryNode node) {
        System.out.print(node + " ");
        if (node.getLeft() != null) {
            preOrder(node.getLeft());
        }
        if (node.getRight() != null) {
            preOrder(node.getRight());
        }
    }

    public void descendingOrder(BinaryNode node) {
        if (node.getLeft() != null) {
            preOrder(node.getRight());
        }
        System.out.print(node + " ");
        if (node.getRight() != null) {
            preOrder(node.getLeft());
        }
    }
}