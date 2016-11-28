package foodChain;

public abstract class plant implements organism
{
	int energy;
	int maxEnergy;
	int col;
	int row;
	char symbol;
	
	public int getCol()
	{
		return col;
	}
	
	public int getRow()
	{
		return row;
	}
	
	public int getEnergy()
	{
		return energy;
	}
	
	public char getSymbol()
	{
		return symbol;
	}
	
	public void setPos(int r, int c)
	{
		row = r;
		col = c;
	}
}