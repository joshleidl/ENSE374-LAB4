package foodChain;

import java.util.ArrayList;

public interface organism
{
	public char getSymbol();
	public int getEnergy();
	public void setPos(int r, int c);
	public int getRow();
	public int getCol();
}