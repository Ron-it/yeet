public class BST {
    private BinaryNode rootNode;

    public BST(BinaryNode rootNode) {
        this.rootNode = new BinaryNode(rootNode);
        ;
    }

    public boolean isEmpty() {
        return this.rootNode == null;
    }

    public void add(Object Node) {
        if (this.isEmpty()) {
            this.rootNode = new BinaryNode(rootNode);
            return;
        }

        else if (this.rootNode == null) {
            this.rootNode = new BinaryNode(rootNode);
            return;
        }
    }

}