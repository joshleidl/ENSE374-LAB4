package foodChain;

public abstract class carnivore extends animal
{
	protected int maxEnergy;
	protected int energy;
	
	public carnivore()
	{
		maxEnergy = 1000;
		energy = 1000;
	}
}