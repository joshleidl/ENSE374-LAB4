import mapping.*;
import foodChain.*;
import java.util.*;

public class lab4
{
	public void generateOrganism()
	{
		switch (Math.random()* 12 + 1) // ThreadLocalRandom.current().nextline( start, end)
		}	
			case 1:
				System.out.println("this is a Wolf");
				break;
			case 2:
				System.out.println("this is a Fox");
				break;
			case 3:
				System.put.println("this is a Hawk");
				break;
			case 4:
				System.out.println("this is a caterpillar");
				break;
			case 5:
				System.out.println("this is a bluejay");
				break;
			case 6:
				System.out.println("this is a grasshopper");
				break;
			case 7:
				System.out.println("this is a mouse");
				break;
			case 8:
				System.out.println("this is a squirrel");
				break;
			case 9:
				System.out.println("this is a rabbit");
				break;
			case 10:
				System.out.println("this is a deer");
				break;
			case 11:
				System.out.println("this is a tree/shrub");
				break;
			case 12:
				System.out.println("this is grass");
				break;
			default:
				System.out.println("this is an invalid organism")
		}
	}
	
	public static void main(String args[])
	{
		
		genrateOrganism();
		
		map disp = new map();
		
		disp.setBorder();
		disp.Clear();
		disp.Print();
		
		linkedList organisms()
		{
			
		}
		
		
	}
}