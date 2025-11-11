package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * A test class for the {@link Board} object.
 */
class BoardTest {

    /**
     * Verifies that a board can be constructed with a valid grid.
     */
    @Test
    void testBoardCreation() {
        Square[][] grid = new Square[1][1];
        Square square = new BasicSquare();
        grid[0][0] = square;

        Board board = new Board(grid);

        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }

    /**
     * Verifies that the board's constructor throws an AssertionError
     * when given a grid with a {@code null} square.
     */
    @Test
    void testBoardWithNullSquare() {
        Square[][] grid = new Square[1][1];
        // grid[0][0] is implicitly null

        assertThrows(AssertionError.class, () -> new Board(grid));
    }
}
