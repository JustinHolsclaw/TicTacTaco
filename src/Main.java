import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Piece game = new Piece();
        int choice = 0;
        System.out.println("Welcome to TicTacToe: Please select an option from the menu.");
        System.out.print("1 Play game\n");
        System.out.print("2 Quit game\n");
        Scanner selection = new Scanner(System.in);
        choice = selection.nextInt();

        switch (choice){
            case 1:
                System.out.println("Player one is automatically x");
                System.out.println("Player two is automatically y");
                game.play();
            case 2: System.exit(0);
        }
    }
}
