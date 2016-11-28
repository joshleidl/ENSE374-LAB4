package foodChain;

public abstract class omnivore extends animal
{
	protected int maxEnergy;
	protected int energy;
	
	public omnivore()
	{
		maxEnergy = 750;
		energy = 750;
	}
}