package foodChain;

public class fox extends carnivore
{
	public fox()
	{
		symbol = 'F';
		
		maxEnergy = 1000;
		energy = 1000;
		
		char canEat[] = {'S', 'M', 'R', 'B'};
	}
}