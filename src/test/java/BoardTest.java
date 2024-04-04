import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.Arrays;

import edu.princeton.cs.algs4.In;

public class BoardTest {
  
  Board board;
  @BeforeEach
  public void setUp() throws Exception {
    board = generateBoard("input10.txt");
  }
  
  private Board generateBoard(String filename) {
 // create initial board from file
    In in = new In("8puzzle-test-files/" + filename);
    int n = in.readInt();
    int[][] blocks = new int[n][n];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            blocks[i][j] = in.readInt();
    Board initial = new Board(blocks);

    // solve the puzzle
    Solver solver = new Solver(initial);

    return initial;
  }

  @Test
  public void testDimension() {
    //fail("Not yet implemented");
  }

  @Test
  public void testSegments() {
    //fail("Not yet implemented");
  }
}
