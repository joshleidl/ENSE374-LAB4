package foodChain;

public class hawk extends carnivore
{
	public hawk()
	{
		symbol = 'H';
		
		maxEnergy = 1000;
		energy = 1000;
		maxDistance = 4;
		
		char canEat[] = {'S', 'M'};
	}
}