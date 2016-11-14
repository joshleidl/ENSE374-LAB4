package foodChain;

public interface animal extends organism
{
	private static int maxEnergy;
	private organism canEat[];
	
	private boolean checkEat(organism org)
	{
		for(int i = 0; i < canEat.length(); i++)
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
	public void move(int cx, int cy);
}