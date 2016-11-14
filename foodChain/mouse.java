package foodChain;

public class mouse extends herbivore
{
	public mouse()
	{
		symbol = 'M';
		
		maxEnergy = 750;
		energy = 750;
		maxDistance = 2;
		
		char canEat[] = {'T', 'G'};
	}
}