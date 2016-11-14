package map;

import foodChain.*;

//needs to extend maps to gain access to the map size variables
public class turn extends map
{
	
	private void takeTurn()
	{
		for (organism current : super.creatureList)
		{
			current.moveCreature(super.column, super.row, super.creatureList);
		}
	}
}