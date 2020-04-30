import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BoardTest {
    // TODO: Test case for playing X in upper left corner
// TODO: Test case for Winning1 - top row
    @Test
    void topRowWinCase(){
        Board board1 = new Board();
        board1.newGame();
        board1.takeSpace(1, 1, 'x');
        board1.takeSpace(2, 1, 'x');
        board1.takeSpace(3, 1, 'x');
        Assertions.assertEquals(true, board1.rowWinGame(), "This was not a win condition.");
    }

    @Test
// TODO: Test case for Winning2 - Middle row
void middleRowWinCase(){
    Board board2 = new Board();
    board2.newGame();
    board2.takeSpace(1, 2, 'x');
    board2.takeSpace(2, 2, 'x');
    board2.takeSpace(3, 2, 'x');
    Assertions.assertEquals(true, board2.rowWinGame(), "This was not a win condition.");
}

    @Test
// TODO: Test case for Winning3 - bottom row
void bottomRowWinCase(){
    Board board3 = new Board();
    board3.newGame();
    board3.takeSpace(1, 3, 'x');
    board3.takeSpace(2, 3, 'x');
    board3.takeSpace(3, 3, 'x');
    board3.printBoard();
    Assertions.assertEquals(true, board3.rowWinGame(), "This was not a win condition.");
}

    @Test
// TODO: Test case for Winning4 - Column 1
void leftColumnWinCase(){
    Board board4 = new Board();
    board4.newGame();
    board4.takeSpace(1, 3, 'x');
    board4.takeSpace(1, 2, 'x');
    board4.takeSpace(1, 1, 'x');
    board4.printBoard();
    Assertions.assertEquals(true, board4.colWinGame(), "This was not a win condition.");
}
    @Test
// TODO: Test case for Winning5 - Column 2
void centerColumnWinCase(){
    Board board5 = new Board();
    board5.newGame();
    board5.takeSpace(2, 3, 'x');
    board5.takeSpace(2, 2, 'x');
    board5.takeSpace(2, 1, 'x');
    board5.printBoard();
    Assertions.assertEquals(true, board5.colWinGame(), "This was not a win condition.");
}
    @Test
// TODO: Test case for Winning6 - Column 3
void rightColumnWinCase(){
    Board board6 = new Board();
    board6.newGame();
    board6.takeSpace(3, 3, 'x');
    board6.takeSpace(3, 2, 'x');
    board6.takeSpace(3, 1, 'x');
    board6.printBoard();
    Assertions.assertEquals(true, board6.colWinGame(), "This was not a win condition.");
}

    @Test
// TODO: Test case for Winning7 - Diagnal 1
void rightTopToLeftBottomDiagonalWinCase(){
    Board board7 = new Board();
    board7.newGame();
    board7.takeSpace(1, 3, 'x');
    board7.takeSpace(2, 2, 'x');
    board7.takeSpace(3, 1, 'x');
    board7.printBoard();
    Assertions.assertEquals(true, board7.oppositeDiagonalWinGame(), "This was not a win condition.");
}
@Test
// TODO: Test case for Winning8 - Diagnal 2
void leftTopToRightBottomDiagonalWinCase(){
    Board board8 = new Board();
    board8.newGame();
    board8.takeSpace(3, 3, 'o');
    board8.takeSpace(2, 2, 'o');
    board8.takeSpace(1, 1, 'o');
    board8.printBoard();
    Assertions.assertEquals(true, board8.diagonalWinGame(), "This was not a win condition.");
}

    @Test
// TODO: Test case for BoardIsFull - all 9 squares have been played
    void gameBoardFull(){
        Board board9 = new Board();
        board9.newGame();
        board9.takeSpace(3, 3, 'o');
        board9.takeSpace(3, 2, 'x');
        board9.takeSpace(3, 1, 'o');
        board9.takeSpace(2, 3, 'x');
        board9.takeSpace(2, 2, 'x');
        board9.takeSpace(2, 1, 'o');
        board9.takeSpace(1, 3, 'o');
        board9.takeSpace(1, 2, 'o');
        board9.takeSpace(1, 1, 'x');
        Assertions.assertEquals(9,board9.turnCounter, "this was not the correct number of turns.");
        Assertions.assertEquals(true, board9.gameWon(), "Should return cats game");

    }
    @Test
// TODO: Test case for playing a piece - can't play in an already used square
    void spotTaken(){
        Board board10 = new Board();
        board10.newGame();
        board10.takeSpace(3, 3, 'x');
        Assertions.assertEquals('x', board10.gameBoard[2][2], "this is not the correct answer");
        board10.takeSpace(3,2,'o');
        Assertions.assertEquals('o', board10.gameBoard[2][1], "This was not the correct answer");
    }

// TODO: Test case for Won't accept column <0 or column >2,  Row <0 or Row >2 on play
//This was automatically incorporated this throws an exception because it goes beyond the array.
// TODO: Test case for Won't accept anything but O or X as placeable pieces
// This is not necessary because of the way in which I coded the players.

}
