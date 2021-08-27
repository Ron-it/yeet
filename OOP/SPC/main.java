public class main {
    public static void main(String[] args) {
        Item fortnite = new Item("fortnite", 12.4, "legendary");

        Item test = new Item("test", 12.4, "testrarity");

        IBIO.output("1. fortnite \n2. test");
        int x = IBIO.inputInt("Select an item # from the list: ");

        test.setPrice(5);

        if (x == 1) {
            System.out.println(fortnite.calculatePriceIncTax());
            System.out.println(fortnite.toString());
        }

        else if (x == 2) {
            System.out.println(test.calculatePriceIncTax());
            System.out.println(test.toString());
        }

    }
}
