package chessgame;

public class Rook extends Piece {
	private String name;

	private boolean isAvail;

	private int player;

	public Rook(String name, int team) {
		this.name = name;
		this.isAvail = true;
		this.player = team;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean isAvail() {
		return isAvail;
	}

	@Override
	public int team() {
		return player;
	}
}
