package chessgame;

public abstract class Piece {

	public abstract String toString();

	public abstract boolean isAvail();

	public abstract int team();

	public abstract void setAvail();

	public abstract String type();
}
