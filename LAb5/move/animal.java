package foodChain;

public interface animal extends organism
{
	private int curRow;
	private int curCol;
	private int maxDistance;
	
	private organism canEat[];
	
	public void eat(organism);
	public void move();
}