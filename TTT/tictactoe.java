public class tictactoe {

    public static void main(String[] args) {

        int count = 0;
        int pos;
        char symbol = 'o';
        char winner = ' ';

        int n = IBIO.inputInt("Enter the size of the grid: ");
        if (n < 3) {
            n = 3;
        }

        String Player1 = IBIO.inputString("Player 1 enter your username: ");
        String Player2 = IBIO.inputString("Player 2 enter your username: ");
        String whoseturn = "";
        displayint(n);

        char grid[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '-';
            }
        }

        whoseturn = Player1;

        while (winner != 'x' && winner != 'o' && count < (n * n)) {

            do {
                pos = IBIO.inputInt("Enter the position for " + whoseturn + ": ");
            } while (pos < 1 || pos > (n * n) || grid[(pos - 1) / n][(pos - 1) % n] != '-');

            grid[(pos - 1) / n][(pos - 1) % n] = symbol;

            display(grid);

            count++;

            winner = CheckWinner(grid);

            if (winner == 'x' || winner == 'o') {

                if (winner == 'x') {
                    IBIO.output("The winner is " + Player1);
                }

                else if (winner == 'o') {
                    IBIO.output("The winner is " + Player2);
                }

            }

            if (symbol == 'o') { // player1
                symbol = 'x';
                whoseturn = Player2;

            }

            else {
                symbol = 'o';
                whoseturn = Player1;
            }
        }
    }

    public static char CheckWinner(char grid[][]) {
        // horizontal rows
        int n = grid.length;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'x') {
                    count1++;
                } else if (grid[i][j] == 'o') {
                    count2++;
                }
            }
            if (count1 == n) {
                return 'x';
            } else if (count2 == n) {
                return 'o';
            }

            count1 = 0; // reset count
            count2 = 0; // reset count
        }

        // vertical colums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[j][i] == 'x') {
                    count1++;
                } else if (grid[j][i] == 'o') {
                    count2++;
                }
            }
            if (count1 == n) {
                return 'x';
            } else if (count2 == n) {
                return 'o';
            }

            count1 = 0; // reset count
            count2 = 0; // reset count

        }

        // forward diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (grid[i][j] == 'x') {
                        count1++;
                    }

                    else if (grid[i][j] == 'o') {
                        count2++;
                    }
                }
            }
        }

        if (count1 == n) {
            return 'x';
        }

        else if (count2 == n) {
            return 'o';
        }
        count1 = 0; // reset count
        count2 = 0; // reset count

        // backward diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    if (grid[i][j] == 'x') {
                        count1++;
                    }

                    else if (grid[i][j] == 'o') {
                        count2++;
                    }
                }
            }
        }

        if (count1 == n) {
            return 'x';
        }

        else if (count2 == n) {
            return 'o';
        }
        count1 = 0; // reset count
        count2 = 0; // reset count

        return ' ';
    }

    public static void display(char grid[][]) {

        int n = grid.length;
        for (int i = 0; i < n; i++) {
            IBIO.out("| ");
            for (int j = 0; j < n; j++) {
                IBIO.out(grid[i][j] + " | ");
            }
            IBIO.output(" ");
        }
    }

    public static void displayint(int n) {

        int countr = 1;
        for (int i = 0; i < n; i++) {
            IBIO.out("| ");
            for (int j = 0; j < n; j++) {
                IBIO.out(countr + " | ");
                countr++;
            }
            IBIO.output(" ");

        }
    }

}
