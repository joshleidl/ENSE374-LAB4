package foodChain;

public interface animal extends organism
{
	private organism canEat[];
	
	public void eat(organism);
	public void move(int cx, int cy);
}