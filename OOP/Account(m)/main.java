public class main {

    public static void main(String[] args) {

        Account account = new Account(1337, 500);

        System.out.println("Select an action to perform: ");
        System.out.println("1. View Account Balance");
        System.out.println("2. Credit Amount");
        System.out.println("3. Debit amount");
        System.out.println("4. setBalance");
        System.out.println("5. Create account");
        System.out.println("6. Exit");

        int input = IBIO.inputInt("Enter a number: ");

        if (input == 1) {
            System.out.println(account.toString());
        }

        if (input == 2) {
            double x = 0.0;

            x = IBIO.inputDouble("Enter amount to credit: ");
            account.credit(x);
            System.out.println(account.toString());
        }

        if (input == 3) {
            double x = 0.0;

            x = IBIO.inputDouble("Enter amount to debit: ");
        }

        if (input == 4) {
            double x = 0.0;
            x = IBIO.inputDouble("Enter initial Account Balance: ");
            account.setBalance(x);
            System.out.println(account.toString());

        }

        if (input == 5) {
            int an = IBIO.inputInt("Enter account number: ");
            double bal = IBIO.inputDouble("Enter initial balance: ");
            Account newAccount = new Account(an, bal);

            System.out.println("Select an action");
            System.out.println("1. View new account info");
            System.out.println("2. ");
            System.out.println(newAccount.toString());
        }

        if (input == 6) {
            System.exit(0);
        }

    }
}