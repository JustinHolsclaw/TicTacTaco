import java.util.Scanner;

public class Board {
    public char[][] gameBoard = new char[3][3];
    int turnCounter;
    char winner;

    void setTurnCounter(){
        turnCounter = 0;
    }

    void incrementCounter(){
        turnCounter = turnCounter+1;
    }


    int correctInputX(int x){
        if(x > 0){
            x = x-1;
        }
        return x;
    }

    int correctInputY(int y){
        if(y > 0){
            y = y-1;
        }
        return y;
    }

    void newGame(){
        int x = 0;
        int y = 0;
        for(int i = 0; i < 9; i++){
            gameBoard[x][y] = ' ';
           if(x == 2){
               x = 0;
               y++;
           }
           else{
               x++;
           }
        }
    }

    void printBoard(){
        System.out.flush();
        int x = 0;
        int y = 0;
        System.out.print(gameBoard[x][y] + "|" + gameBoard[x+1][y] + "|" + gameBoard[x+2][y]
                + "\n" + gameBoard[x][y+1] + "|" + gameBoard[x+1][y+1] + "|" + gameBoard[x+2][y+1] + "\n"
                + gameBoard[x][y+2] + "|" + gameBoard[x+1][y+2] + "|" + gameBoard[x+2][y+2] + "\n");
    }


    public void takeSpace(int x, int y, char choice) {
        x = correctInputX(x);
        y = correctInputY(y);
        if(gameBoard[x][y] != ' '){
            System.out.println("This spot has already been taken please make another selection.");
            Scanner otherChoice = new Scanner(System.in);
            choice = otherChoice.next().charAt(0);
            takeSpace(x, y, choice);
        }
        else{
            gameBoard[x][y] = choice;
            turnCounter++;
        }

    }

    boolean catsGame(){
        boolean catGame;
        if(turnCounter == 9){
            catGame = true;
        }
        else catGame = false;
        return catGame;
    }

    boolean rowWinGame(){
        int x = 0;
        int y = 0;
        char one = 0;
        char two = 0;
        char three = 0;
        boolean rowWin = false;
        for(int i = 0; i < 9 && rowWin != true; i++){
            if(x == 2) {
                if (one == two && two == three && one != ' ') {
                    rowWin = true;
                    winner = one;
                }
                x = 0;
                y++;
            }

            else{
                if(x == 0){
                    one = gameBoard[x][y];
                }
                if(x == 1){
                    two = gameBoard[x][y];
                }
                x++;
                if(x == 2){
                    three = gameBoard[x][y];
                }
            }
        }
        return rowWin;
    }


    boolean colWinGame(){
        int x = 0;
        int y = 0;
        char one = 0;
        char two = 0;
        char three = 0;
        boolean colWin = false;
        for(int i = 0; i < 9 && colWin != true; i++){
            if(y == 2) {
                if (one == two && two == three && one != ' ') {
                    colWin = true;
                    winner = one;
                }
                y = 0;
                x++;
            }

            else{
                if(y == 0){
                    one = gameBoard[x][y];
                }
                if(y == 1){
                    two = gameBoard[x][y];
                }
                y++;
                if(y == 2){
                    three = gameBoard[x][y];
                }
            }
        }
        return colWin;
    }

    boolean diagonalWinGame(){
        int x = 0;
        int y = 0;
        char one = 0;
        char two = 0;
        char three = 0;
        boolean diagonalWin = false;
        for(int i = 0; i < 9 && diagonalWin != true; i++){
            if(y == 2) {
                if (one == two && two == three && one != ' ') {
                    diagonalWin = true;
                    winner = one;
                }
                y = 0;
                x++;
            }

            else{
                if(y == x && x == 0){
                    one = gameBoard[x][y];
                }
                if(y == x && x == 1){
                    two = gameBoard[x][y];
                }
                y++;
                if(y == x && x==2){
                    three = gameBoard[x][y];
                }
            }
        }
        return diagonalWin;
    }

    boolean oppositeDiagonalWinGame(){
        int x = 0;
        int y = 0;
        char one = ' ';
        char two = ' ';
        char three = ' ';
        boolean oppDiagonalWin = false;
        for(int i = 0; i < 9 && oppDiagonalWin != true; i++){
            if(y == 2) {
                if(x == 0){
                    one = gameBoard[x][y];
                }
                if (one == two && two == three && one != ' ') {
                    oppDiagonalWin = true;
                    winner = one;
                }
                y = 0;
                x++;
            }

            else{
                if(y == x && x == 1){
                    two = gameBoard[x][y];
                }
                if(y == 0 && x==2){
                    three = gameBoard[x][y];
                }
                y++;
            }
        }
        return oppDiagonalWin;
    }




    public boolean gameWon() {
        boolean winLoss = false;

if(rowWinGame()){
    System.out.print("The winner is player " + winner + "\n");
    winLoss = true;
}
if(catsGame()){
    System.out.println("Cats Game");
    winLoss = true;
}
if(colWinGame()){
    System.out.print("The winner is player " + winner + "\n");
    winLoss = true;
}
if(diagonalWinGame()){
    System.out.print("The winner is player " + winner + "\n");
    winLoss=true;
}
if(oppositeDiagonalWinGame()){
    System.out.print("The winner is player " + winner + "\n");
    winLoss = true;
}

        return winLoss;
    }
}
