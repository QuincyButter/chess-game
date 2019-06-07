package chessgame;

import java.util.Scanner;

public class ChessGameTest {
	public static void main(String[] args) {
		Board board = new Board();
		Scanner c = new Scanner(System.in);

		int team = 2;
		String to, from;
		int x1, y1, x2, y2;

		while (board.win()) {

			board.printBoard();
			System.out.println();

			if (team % 2 != 0) {
				System.out.print("Player 2's move: ");
				team++;
			} else {
				System.out.print("Player 1's move: ");
				team--;
			}

			from = c.next();
			to = c.next();

			y1 = (int) from.charAt(0) - 97;
			x1 = (int) from.charAt(1) - 49;
			y2 = (int) to.charAt(0) - 97;
			x2 = (int) to.charAt(1) - 49;

			// if (board.isValid(x1, y1, x2, y2)) {
			// board.move(x1, y1, x2, y2, team);
			// }

			board.move(x1, y1, x2, y2, team);

		}
		System.out.println("Congratulations! Player " + team + " has won!");
		c.close();
	}
}
