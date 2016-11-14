package foodChain;

public abstract class animal extends organism
{
	protected int maxEnergy;
	protected char canEat[];
	protected int row;
	protected int col;
	
	private boolean checkEat(organism org)
	{
		for(int i = 0; i < canEat.length; i++)
			if(canEat[i] == org.getSymbol())
				return true;
			
		return false;
	}
	
	public boolean eat(organism org)
	{
		if(checkEat(org))
		{
			//CASE: Contact is edible
			//Increase the eater's energy
			if(this.energy + (org.getEnergy() * .7) > this.maxEnergy)
				this.energy = this.maxEnergy;
			else
				this.energy += (org.getEnergy() * .7);
			
			org = null; //Delete the eaten organism
			
			return true;
		}
		else
			//CASE: Contact is inedible
			return false;
	}
	
	public boolean move()
	//public abstract void move(int cx, int cy);
}