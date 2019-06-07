package chessgame;

public class Rook extends Piece {
	private String name;

	private boolean isAvail;

	private int player;

	private String type;

	public Rook(String name, int team) {
		this.name = name;
		this.isAvail = true;
		this.player = team;
		this.type = "rook";
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

	@Override
	public void setAvail() {
		if (isAvail)
			isAvail = false;
		else
			isAvail = true;
	}

	@Override
	public String type() {
		return type;
	}
}
