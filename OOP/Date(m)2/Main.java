public class Main {
    public static void main(String[] args) {
        int day = 1;
        int month = 1;
        int year = 2004;

        do {
            day = IBIO.inputInt("Enter day: ");
            month = IBIO.inputInt("Enter month: ");
            year = IBIO.inputInt("Enter year: ");

        } while (day != 0 && day < 32 && month != 0 && month <= 12 && year != 0);

        // day = IBIO.inputInt("Enter day: ");

        // if (day == 0 || day > 32) {
        // System.out.println("Error - Please enter a valid day");

        // }

        // month = IBIO.inputInt("Enter month: ");

        // if (month == 0 || month > 12) {
        // System.out.println("Error - Please enter a valid month");
        // month = IBIO.inputInt("Enter month: ");
        // }

        // year = IBIO.inputInt("Enter year: ");

        // if (year == 0) {
        // System.out.println("Error - Please enter a valid year");
        // year = IBIO.inputInt("Enter year: ");
        // }

        Date date = new Date(year, month, day);

        System.out.println(date.toString());

    }
}
