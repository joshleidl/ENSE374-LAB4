package foodChain;

public class wolf extends carnivore
{
	public wolf()
	{
		symbol = 'W';
		
		maxEnergy = 1000;
		energy = 1000;
		maxDistance = 3;
		
		char canEat[] = {'R', 'D'};
	}
}