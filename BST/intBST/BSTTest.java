public class BSTTest {
    public static void main(String[] args) {
        BST b = new BST(5);
        b.add(12);
        b.add(3);
        b.add(9);
        b.add(2);
        System.out.print("InOrder traversal:");
        b.inOrder(b.getRoot());
        System.out.println();
        System.out.print("preOrder traversal:");
        b.preOrder(b.getRoot());
        System.out.println();
        System.out.print("postOrder traversal:");
        b.postOrder(b.getRoot());
        System.out.println();
        System.out.print("descendingOrder traversal:");
        b.descendingOrder(b.getRoot());
        System.out.println();
        int search = 1;
        while (search != 0) {
            search = IBIO.inputInt("Search for node (0 to exit): ");
            if (search != 0) {
                System.out.println("Search for " + search + ": " + b.search(search));
            } else {
                System.exit(0);
            }

        }
    }
}
