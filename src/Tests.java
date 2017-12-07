import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {
	
	private TicTacToeBoard createBoard(String boardState, boolean swapOX) {
		TicTacToeBoard b = new TicTacToeBoard();
		int i = 0;
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				int code = -1;
				switch(boardState.charAt(i)) {
				case 'o':
					code = swapOX ? 1 : 2;
					break;
				case 'x':
					code = swapOX ? 2 : 1;
					break;
				case '.':
					code = 0;
					break;
				default:
					fail("Invalid string boardState: " + boardState);
				}
				i++;
			}
		}
		return b;
	}
	
	private void assertGameState(String boardState, int state) {
		TicTacToeBoard b = createBoard(boardState, false);
		assertTrue("Failed on board: " + boardState +
				   " and state: " + Integer.toString(state),
				b.getGameState() == state);
		
		if (state != 0) {
			int oppositeState = state == 1 ? 2 : 1;
			assertTrue(b.getGameState() == oppositeState);
		}
	}
	
	@Test
	public void testGetGameState() {
		assertGameState(".........", 0);
		assertGameState("ooo......", 1);
		assertGameState("ooox.xx..", 1);
		assertGameState("o..xo..xo", 1);
	}

	private TicTacToeBoard createBoard(String boardMoves) {
		TicTacToeBoard b = new TicTacToeBoard();
		int i = 0;
		int[] xMoves = new int[9],
			  yMoves = new int[9];
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				int moveNumber = boardMoves.charAt(i) - '1';
				if (moveNumber < 0 || moveNumber > 9) {
					fail("Parse error for moveNumber" + Integer.toString(moveNumber));
				}
				i++;
			}
		}
		return b;
	}
}
