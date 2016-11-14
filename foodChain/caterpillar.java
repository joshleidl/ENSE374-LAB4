package foodChain;

public class caterpillar extends herbivore
{
	public caterpillar()
	{
		symbol = 'C';
		
		maxEnergy = 500;
		energy = 500;
		maxDistance = 1;
		
		char canEat[] = {'T'};
	}
}