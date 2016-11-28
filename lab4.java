import foodChain.*;
import java.util.*;

public class lab4
{
	public static void main(String args[])
	{
		map disp = new map();
		
		Scanner scanIn = new Scanner(System.in);
		int input = 0;
		
		disp.setBorder();
		disp.Clear();
		
		while(input > 100 || input < 1)
		{
			System.out.print("Please enter the frequency of organisms (1 - 100): ");
			input = scanIn.nextInt();
		}
		
		disp.Populate(input);
		
		while(input != -1)
		{
			disp.Update();
			disp.Print();
			
			System.out.print("\nGive input for next frame (-1 to exit): ");
			input = scanIn.nextInt();
		}
		
	}
}