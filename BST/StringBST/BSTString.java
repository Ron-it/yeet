public class BSTString {

    BinaryNodeString root;

    public BSTString(String data)
    {
        this.root = new BinaryNodeString(data);
        System.out.printf("Buidling BST with root %s\n", data);
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void add(String data)
    {
        BinaryNodeString newNode = new BinaryNodeString(data);
        add(this.root, newNode);
    }

    private void add(BinaryNodeString node, BinaryNodeString data)
    {
        if (data.compareTo(node) < 0)
        {
            if (node.left != null)
            {
                add(node.left, data);
            } else
            {
                System.out.println(data + " inserted to the left of node " + node.word);
                node.left = data;
            }
        } else if (data.compareTo(node) > 0)
        {
            if (node.right != null)
            {
                add(node.right, data);
            } else
            {
                System.out.println(data + " inserted to the right of node " + node.word);
                node.right = data;
            }
        }
    }

    public boolean search(String searchData)
    {
        BinaryNodeString search = new BinaryNodeString(searchData);
        return search(this.root, search);
    }

    private boolean search(BinaryNodeString node, BinaryNodeString search)
    {

        if (node == null)
        {
            return false;
        }
        if (search.compareTo(node) == 0)
        {
            return true;
        } else if (search.compareTo(node) < 0)
        {
            return search(node.left, search);
        } else
        {
            return search(node.right, search);
        }
    }

    private void inOrder(BinaryNodeString node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.word + " ");
            inOrder(node.right);
        }
    }

    public void inOrder(){
        inOrder(root);
    }

    private void preOrder(BinaryNodeString node){
        if(node != null){
            System.out.println(node.word + " ");
            inOrder(node.left);
            inOrder(node.right);
        }
    }

    public void preOrder(){
        inOrder(root);
    }

    private void postOrder(BinaryNodeString node){
        if(node != null){
            inOrder(node.left);
            inOrder(node.right);
            System.out.println(node.word + " ");
        }
    }

    public void postOrder(){
        inOrder(root);
    }

}
