package chessgame;

public class King extends Piece {
	private String name;

	private boolean isAvailible;

	private int player;

	public King(String name, int team) {
		this.name = name;
		this.isAvailible = true;
		this.player = team;
	}

	@Override
	public String toString() {
		return name;
	}
	
	public boolean isAvail() {
		return isAvailible;
	}

	@Override
	public int team() {
		return player;
	}
	
}
