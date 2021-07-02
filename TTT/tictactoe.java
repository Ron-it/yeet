public class tictactoe {

    public static void main(String[] args){

        
        int count = 0;
        int pos;
        char symbol = 'o';
        char winner = ' ';

        int n = IBIO.inputInt("Enter the size of the grid: ");
        if(n<3){
            n=3;
        }

        char grid[][] = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j= 0; j<n; j++){
                grid[i][j] = '-';
            }
        }

        while( winner != 'x' && winner != 'o' && count<(n*n)){
        
        

        do{
            pos = IBIO.inputInt("Enter the position: ");
        }while(pos<1 || pos > (n*n) || grid[(pos-1)/n][(pos-1)%n]!='-');

        grid[(pos-1)/n][(pos-1)%n] = symbol;

        display(grid);

        count++;

        winner = CheckWinner(grid);

if(winner == 'x' || winner == 'o'){
    IBIO.output("The winner is " + winner);
}


        if(symbol == 'o'){
            symbol = 'x';
        }

        else{
            symbol = 'o';
        }
    }
}

    public static char CheckWinner(char grid[][]){
        //horizontal rows
        int n = grid.length;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j]== 'x'){
                    count1++;
                }
                else if(grid[i][j]== 'o'){
                    count2++;
                }
            }
            if(count1==n){
                return 'x';
            }
            else if(count2==n){
                return 'o';
            }
    
        count1 = 0; //reset count
        count2 = 0; //reset count
        }

        //vertical colums
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(grid[j][i]== 'x'){
                    count1++;
                }
                else if(grid[j][i]== 'o'){
                    count2++;
                }
            }
            if(count1==n){
                return 'x';
            }
            else if(count2==n){
                return 'o';
            }
        
        count1 = 0; //reset count
        count2 = 0; //reset count

        }


        //forward diagonal        
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j){
                    if(grid[i][j]=='x'){
                    count1++;
                }
            
                    else if(grid[i][j]== 'o'){
                    count2++;
                }
            }
        }
    }

        if(count1==n){
            return 'x';
        }

        else if(count2==n){
            return 'o';
        }
        count1 = 0; //reset count
        count2 = 0; //reset count





//backward diagonal        
for(int i=0; i<n; i++){
    for(int j = 0; j<n; j++){
        if(i+j == n-1){
            if(grid[i][j]=='x'){
            count1++;
        }
    
            else if(grid[i][j]== 'o'){
            count2++;
        }
    }
}
}

if(count1==n){
    return 'x';
}

else if(count2==n){
    return 'o';
}
count1 = 0; //reset count
count2 = 0; //reset count

return ' ';
}

public static void display(char grid[][]){

    int n = grid.length;
    for(int i=0; i<n; i++){
        IBIO.out("| ");
        for(int j = 0; j<n; j++){
            IBIO.out(grid[i][j] + " | ");
        }
        IBIO.output(" ");
    }
}


}
