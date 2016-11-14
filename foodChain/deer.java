package foodChain;

public class deer extends herbivore
{
	public deer()
	{
		symbol = 'D';
		
		maxEnergy = 1000;
		energy = 1000;
		maxDistance = 2;
		
		char canEat[] = {'T', 'G'};
	}
}