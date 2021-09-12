public class BinaryNode {
    private Object data;// can be replaced by any class or wrapper class
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(Object data) {
        this.data = data;
        /*
         * just overstating the obvious -- objects are null by default this.left = null;
         * this.right = null;
         */
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryNode.data=" + data;
    }

    public static void main(String[] args) {
        Integer i = new Integer(5);
        BinaryNode n = new BinaryNode(i);
        System.out.println(n);
    }
}