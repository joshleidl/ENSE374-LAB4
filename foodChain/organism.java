package foodChain;

public abstract class organism
{
	protected int energy;
	protected char symbol;
	
	public char getSymbol()
	{
		return symbol;
	}
	
	public int getEnergy()
	{
		return energy;
	}
	
	public boolean move();
}