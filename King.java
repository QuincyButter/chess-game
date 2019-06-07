package chessgame;

public class King extends Piece {
	private String type;

	private String name;

	private boolean isAvail;

	private int player;

	public King(String name, int team) {
		this.name = name;
		this.isAvail = true;
		this.player = team;
		this.type = "king";
	}

	@Override
	public String toString() {
		return name;
	}

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
