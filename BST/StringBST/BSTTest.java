public class BSTTest {
    public static void main(String[] args)
    {
        BSTString b = new BSTString("TGG");
        System.out.println();

        b.add("Anomaly");
        b.add("SOG");
        b.add("ohne");
        b.add("Fresh");
        b.add("Sparkles");
        b.add("n0ted");
        b.add("Sketch");
        b.add("PIZ0");
        b.add("MMD");
        b.add("Milliam");
        b.add("Mew");
        System.out.println();

        System.out.println("InOrder traversal:");
        b.inOrder();
        System.out.println();
        System.out.println("preOrder traversal:");
        b.preOrder();
        System.out.println();
        System.out.println("postOrder traversal:");
        b.postOrder();
        System.out.println();

        String search = "";
        while (!(search.equals("EXIT"))) {
            search = IBIO.inputString("Search for node (EXIT to quit): ");
            if (!(search.equals("EXIT"))) {
                System.out.println("Search for " + search + ": " + b.search(search));
            } else {
                System.exit(0);
            }
        }
    }
}
