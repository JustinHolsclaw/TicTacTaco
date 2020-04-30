import java.util.Scanner;

public class Piece {
    char player1;
    char player2;

    void setPlayer1(char firstInput){
        player1 = 'x';
    }
    void setPlayer2(char secondInput){
        player2 = 'o';
    }


    void play() {
        int x;
        int y;
        Board playGame = new Board();
        Scanner userSelect = new Scanner((System.in));
        playGame.newGame();
        for (int i = 0; i < 9; i++) {
            playGame.printBoard();
            if (playGame.turnCounter == 0 || playGame.turnCounter == 2 || playGame.turnCounter == 4 || playGame.turnCounter == 6 || playGame.turnCounter == 8) {
                System.out.println("\nplayer x please input your selection between 1 to 3 on the x axis.");
                x = userSelect.nextInt();
                if(x > 3 || x < 1){
                    System.out.println("Please enter a valid choice");
                    x = userSelect.nextInt();
                }
                System.out.println("player x please input your selection between 1 to 3 on the y axis.");
                y = userSelect.nextInt();
                if(y > 3 || y < 1){
                    System.out.println("Please enter a valid choice");
                    y = userSelect.nextInt();
                }
                playGame.takeSpace(x, y, 'x');
            }
            else {
                System.out.println("player o please input your selection between 1 to 3 on the x axis.");
                x = userSelect.nextInt();
                if(x > 3 || x < 1){
                    System.out.println("Please enter a valid choice");
                    x = userSelect.nextInt();
                }
                System.out.println("player o please input your selection between 1 to 3 on the y axis.");
                y = userSelect.nextInt();
                if(y > 3 || y < 1){
                    System.out.println("Please enter a valid choice");
                    x = userSelect.nextInt();
                }
                playGame.takeSpace(x, y, 'o');
            }

            if(playGame.gameWon() == true){
                i = 9;
            }
        }
    }

}

