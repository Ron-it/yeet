public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("1fa3", "4pin adapter", 2, 3);
        System.out.println("The total price of " + invoice.getPartDescription() + " is " + invoice.getInvoiceAmount());

    }
}
