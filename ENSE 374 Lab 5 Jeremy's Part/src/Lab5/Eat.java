package Lab5;

public class Eat 
{
	/* When moving to an adjacent square, the animal at the current square checks if the 
	* organism on the adjacent square can be eaten. If so than that animal eats the organism 
	* 
	* character representations for each animal
	* Tree/Shrub: T
	* Grass: G
	* Caterpillar: C
	* Bluejay: B
	* Hawk: H
	* Grasshopper: P
	* Mouse: M
	* Fox: F
	* Squirrel: S
	* Rabbit: R
	* Deer: D
	* Wolf: W
	*/
	
	public Eat()
	{
	}
	
	/* takes hierarchy level, of the current and adjacent organism */
	public boolean checkIfEdible(char currentLevel, char adjacentLevel)
	{
		// everything that the wolf eats
		if (currentLevel == 'W' && adjacentLevel == 'R')
		{
			System.out.println("the Wolf can eat the Rabbit");
			return true;
		}
		
		else if ( currentLevel == 'W' && adjacentLevel == 'D')
		{
			System.out.println("the Wolf can eat the Deer");
			return true;
		}
		
		// everything that the fox eats
		else if (currentLevel == 'F' && adjacentLevel == 'S')
		{
			System.out.println("the Fox can eat the Squirrel");
			return true;
		}
		
		else if (currentLevel == 'F' && adjacentLevel == 'R')
		{
			System.out.println("the Fox can eat the Rabbit");
			return true;
		}
		
		else if (currentLevel == 'F' && adjacentLevel == 'M')
		{
			System.out.println("the Fox can eat the Mouse");
			return true;
		}
		
		else if (currentLevel == 'F' && adjacentLevel == 'B')
		{
			System.out.println("the Fox can eat the Bluejay");
			return true;
		}
		
		// everything that the hawk eats
		else if (currentLevel == 'H' && adjacentLevel == 'M')
		{
			System.out.println("the Hawk can eat the Mouse");
			return true;
		}
		
		else if(currentLevel == 'H' && adjacentLevel == 'S')
		{
			System.out.println("the Hawk can eat the Squirrel");
			return true;
		}
		
		// everything that the bluejay eats
		else if (currentLevel == 'B' && adjacentLevel == 'T')
		{
			System.out.println("the Bluejay can eat the Tree/Shrub");
			return true;
		}
		
		else if (currentLevel == 'B' && adjacentLevel == 'C')
		{
			System.out.println("the Bluejay can eat the Caterpillar");
			return true;
		}
		
		
		else if(currentLevel == 'B' && adjacentLevel == 'P')
		{
			System.out.println("the Bluejay can eat the Grasshopper");
			return true;
		}
		
		// everything that the caterpillar eats
		else if(currentLevel == 'C' && adjacentLevel == 'T')
		{
			System.out.println("the Caterpillar can eat the Tree/Shrub");
			return true;
		}
		
		// everything that the grasshopper eats
		else if(currentLevel == 'P' && adjacentLevel == 'G')
		{
			System.out.println("the Bluejay can eat the Grasshopper");
			return true;
		}
		
		// everything that the mouse eats
		else if(currentLevel == 'M' && adjacentLevel == 'T')
		{
			System.out.println("the Mouse can eat the Tree/Shrub");
			return true;
		}
		
		else if(currentLevel == 'M' && adjacentLevel == 'G')
		{
			System.out.println("the Mouse can eat the Grass");
			return true;
		}
		
		// everything that the squirrel eats
		else if(currentLevel == 'S' && adjacentLevel == 'T')
		{
			System.out.println("the Squirrel can eat the Tree/Shrub");
			return true;
		}
		
		// everything that the rabbit eats
		else if(currentLevel == 'R' && adjacentLevel == 'G')
		{
			System.out.println("the Rabbit can eat the Grass");
			return true;
		}
		
		//everything that the deer eats
		else if(currentLevel == 'D' && adjacentLevel == 'T')
		{
			System.out.println("the Deer can eat the Tree/Shrub");
			return true;
		}
		
		else if(currentLevel == 'D' && adjacentLevel == 'G')
		{
			System.out.println("the Deer can eat the Grass");
			return true;
		}
		
		else
			return false;
	}
	
	/* if checkIfEdible returns true then this function */
	public void eat()
	{
		System.out.println("the adjacent organism has been succesfully eaten");
		
		/* proceed to remove and replace adjacent square with current square */
	}
	
	
	
	/* 	use in calling function
	 	
		if (checkIfEdible(adjacentLevel, adjacentLevel))
			Eat.eat()
	*/
}
