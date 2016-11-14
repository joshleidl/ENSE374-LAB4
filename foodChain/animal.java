package foodChain;

/*
TODO:
Implement maximum movement variable N



*/

import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

/*
Max distance variable maxDistance
*/

public abstract class animal extends organism
{
	protected int maxEnergy;
	protected char canEat[];
	protected int row;
	protected int col;
	protected int maxDistance;
	
	private boolean checkEat(organism org)
	{
		for(int i = 0; i < canEat.length; i++)
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
	
	public void moveCreature(int mapCol, int mapRow, ArrayList<organism> creatureList)
	{
		boolean success = false;
		int newCol, newRow, test;
		
		while (success == false)
		{
			newCol = col + ThreadLocalRandom.current().nextInt(-maxDistance, maxDistance + 1);
			newRow = row + ThreadLocalRandom.current().nextInt(-maxDistance, maxDistance + 1);
			
			if (newCol < 0 || newCol > mapCol)
				success = false;
			else if (newRow < 0 || newRow > mapRow)
				success = false;
			else
			{
				test = 0;
				for (organism current : creatureList)
				{
					if (current.getRow() == newRow && current.getCol() == newCol)
					{
						if (test == 0)
						{
							success = eat(current);
							if (success == false)
								test = 1;
						}
					}
				}
				if (test == 0)
				{
					success = true;
				}
			}
		}
		
		col = newCol;
		row = newRow;
	}
}