public class BST
{
    private BinaryNode root;

    //public BST(BinaryNode root) { this.root = root; }

    public BST(int root)
    {
        this.root = new BinaryNode(root);
        System.out.println("BST created with " + root + " as its root.");
    }

    public boolean isEmpty()
    {
        return this.root == null;
    }

    public void add(BinaryNode node, BinaryNode newNode)
    {
        if (newNode.getData() < node.getData())
        {
            if (node.getLeft() != null)
                add(node.getLeft(), newNode);
            else
            {
                node.setLeft(newNode);
                System.out.println(newNode + " added to the left of " + node);
            }
        } else if (newNode.getData() > node.getData())
        {
            if (node.getRight() != null)
                add(node.getRight(), newNode);
            else
            {
                node.setRight(newNode);
                System.out.println(newNode + " added to the right of " + node);
            }
        }
    }

    public void add(int data)
    {
        BinaryNode n = new BinaryNode(data);
        add(this.root, n);
    }

    private void inOrder(BinaryNode node)
    {
        if (node.getLeft() != null)
            inOrder(node.getLeft());
        System.out.print(node + " ");
        if (node.getRight() != null)
            inOrder(node.getRight());
    }

        private void postOrder(BinaryNode node) {
        if(node.getLeft() != null){
            postOrder(node.getLeft());
        }
        if(node.getRight() != null){
            postOrder(node.getRight());
        }
        System.out.print(node + " ");
    } 

    private void preOrder(BinaryNode node){
        System.out.print(node + " ");
        if(node.getLeft() != null){
            preOrder(node.getLeft());
        }
        if(node.getRight() != null){
            preOrder(node.getRight());
        }
    }

    public static void main(String[] args)
    {
        BST b = new BST(5);
        b.add(12);
        b.add(3);
        b.add(9);
        b.add(2);
        System.out.print("InOrder traversal: \n");
        b.inOrder(b.root);
        System.out.print("preOrder traversal: \n");
        b.preOrder(b.root);
        System.out.print("postOrder traversal: \n");
        System.out.println();
        b.postOrder(b.root);
    }

}
