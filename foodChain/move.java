//package foodChain;

import java.util.concurrent.ThreadLocalRandom;
import java.lang.Error.*;

public class move extends animal
{
		
	private int amount;
	private int direction;
	private int mapCol;
	private int mapRow;
	private int testCol;
	private int testRow;
	private organism newOrg;
	private organism[] creatureList;
	
	private boolean validUpdate()
	{
		if (testCol < 0 || testCol > mapCol)
			return false;
		if (testRow < 0 || testRow > mapRow)
			return false;
		
		if (checkEmpty())
			return true;
		else if (canEat.contains(newOrg))/////////////////////////////////
			return true;
		
		return false;
	}
	
	private void setPosition()
	{
		testCol = super.curCol;
		testRow = super.curRow;
		if (direction == 0)
			testRow += amount;
		else if (direction == 1)
			testCol += amount;
		else if (direction == 2)
			testRow -= amount;
		else if (direction == 3)
			testCol -= amount;
		else
			Error("Direction out of bounds");
	}
	
	public void moveCreature(int mapCol, int mapRow, organism[] creatureList)
	{
		this.creatureList = creatureList;
		this.mapCol = mapCol;
		this.mapRow = mapRow;
		update();
	}
	
	private void update()
	{
		boolean success = false;
		
		while (success == false)
		{
			amount = ThreadLocalRandom.current().nextInt(0, maxDistance + 1);
			direction = ThreadLocalRandom.current().nextInt(0, 3 + 1);
		
			setPosition();
			success = validUpdate();
		}
		
		super.curCol = testCol;
		super.curRow = testRow;
		
		if (checkEmpty())
		{	
			eat();//////////////////////////////////////////////////////
		}
	}
	
	private boolean checkEmpty()
	{
		for (organism current : creatureList)
		{
			if (current.curRow = testRow && current.curCol = testCol)
			{
				newOrg = current;
				return false;
			}
		}
		return true;
	}
	
	
}