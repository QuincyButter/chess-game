package chessgame;

public class Board {
	/** Initialization of the this.board */
	private Piece[][] board = new Piece[8][8];

	/** White team specials */
	private Rook wr1, wr2;
	private Knight wk1, wk2;
	private Bishop wb1, wb2;
	private King wk;
	private Queen wq;

	/** Black team specials */
	private Rook br1, br2;
	private Knight bk1, bk2;
	private Bishop bb1, bb2;
	private King bk;
	private Queen bq;

	/** White team pawns */
	private Pawn wp1, wp2, wp3, wp4, wp5, wp6, wp7, wp8;

	/** Black team pawns */
	private Pawn bp1, bp2, bp3, bp4, bp5, bp6, bp7, bp8;

	/**
	 * Constructor for the this.board
	 */
	public Board() {
		for (int row = 2; row < 6; row++) {
			for (int col = 0; col < this.board.length; col++) {
				this.board[row][col] = null;
			}
		}

		/** Initialization and setting of white team pieces */
		wr1 = new Rook("R1", 1);
		wr2 = new Rook("R2", 1);
		this.board[0][0] = wr1;
		this.board[0][7] = wr2;

		wk1 = new Knight("K1", 1);
		wk2 = new Knight("K2", 1);
		this.board[0][1] = wk1;
		this.board[0][6] = wk2;

		wb1 = new Bishop("B1", 1);
		wb2 = new Bishop("B2", 1);
		this.board[0][2] = wb1;
		this.board[0][5] = wb2;

		wk = new King("Ki", 1);
		wq = new Queen("Qu", 1);
		this.board[0][3] = wk;
		this.board[0][4] = wq;

		/** Initialization and setting of black team pieces */
		br1 = new Rook("r1", 2);
		br2 = new Rook("r2", 2);
		this.board[7][0] = br1;
		this.board[7][7] = br2;

		bk1 = new Knight("k1", 2);
		bk2 = new Knight("k2", 2);
		this.board[7][1] = bk1;
		this.board[7][6] = bk2;

		bb1 = new Bishop("b1", 2);
		bb2 = new Bishop("b2", 2);
		this.board[7][2] = bb1;
		this.board[7][5] = bb2;

		bk = new King("ki", 2);
		bq = new Queen("qu", 2);
		this.board[7][3] = bk;
		this.board[7][4] = bq;

		/** Initialization and setting in pawns */
		wp1 = new Pawn("P1", 1);
		bp1 = new Pawn("p1", 2);
		this.board[1][0] = wp1;
		this.board[6][0] = bp1;

		wp2 = new Pawn("P2", 1);
		bp2 = new Pawn("p2", 2);
		this.board[1][1] = wp2;
		this.board[6][1] = bp2;

		wp3 = new Pawn("P3", 1);
		bp3 = new Pawn("p3", 2);
		this.board[1][2] = wp3;
		this.board[6][2] = bp3;

		wp4 = new Pawn("P4", 1);
		bp4 = new Pawn("p4", 2);
		this.board[1][3] = wp4;
		this.board[6][3] = bp4;

		wp5 = new Pawn("P5", 1);
		bp5 = new Pawn("p5", 2);
		this.board[1][4] = wp5;
		this.board[6][4] = bp5;

		wp6 = new Pawn("P6", 1);
		bp6 = new Pawn("p6", 2);
		this.board[1][5] = wp6;
		this.board[6][5] = bp6;

		wp7 = new Pawn("P7", 1);
		bp7 = new Pawn("p7", 2);
		this.board[1][6] = wp7;
		this.board[6][6] = bp7;

		wp8 = new Pawn("P8", 1);
		bp8 = new Pawn("p8", 2);
		this.board[1][7] = wp8;
		this.board[6][7] = bp8;
	}

	/**
	 * Prints out the board
	 */
	public void printBoard() {
		System.out.println("   a  b  c  d  e  f  g  h");
		for (int i = 0; i < board.length; i++) {
			System.out.print(i + 1 + " ");
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == null)
					System.out.print("--");
				else
					System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	/**
	 * Moves a piece from one spot to another
	 * 
	 * @param x1 - X location of the piece being moved
	 * @param y1 - Y location of the piece being moved
	 * @param x2 - X location of the target spot
	 * @param y2 - Y location of the target spot
	 */
	public void move(int x1, int y1, int x2, int y2, int team) {
		if (board[x2][y2] == null) {
			board[x2][y2] = board[x1][y1];
			board[x1][y1] = null;
		} else {
			board[x2][y2].setAvail();
			board[x2][y2] = board[x1][y1];
			board[x1][y1] = null;
		}
	}

	/**
	 * Tells if a move is valid
	 * 
	 * @param x1 - From X value
	 * @param y1 - From y value
	 * @param x2 - To x value
	 * @param y2 - To y value
	 * @return if the move is valid
	 */
	public boolean isValid(int x1, int y1, int x2, int y2) {
		if (board[x1][y1].team() == board[x2][y2].team())
			return false;
		else if (board[x1][y1].type().equals("rook")) {
			
		} 
		else if (board[x1][y1].type().equals("bishop")) {

		} 
		else if (board[x1][y1].type().equals("knight")) {

		} 
		else if (board[x1][y1].type().equals("king")) {

		} 
		else if (board[x1][y1].type().equals("queen")) {

		} 
		else if (board[x1][y1].type().equals("pawn")) {

		}
		return false;
	}

	public boolean isClear(int x1, int y1, int x2, int y2) {
		
		
		
		return false;
	}

	/**
	 * Tells if the game has been won
	 * 
	 * @return - if someone has won
	 */
	public boolean win() {
		if (wk.isAvail() && bk.isAvail())
			return true;
		else
			return false;
	}
}
