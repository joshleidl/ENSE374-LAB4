package foodChain;

public abstract class herbivore extends animal
{
	protected int maxEnergy;
	protected int energy;
	
	public herbivore()
	{
		maxEnergy = 500;
		energy = 500;
	}
}