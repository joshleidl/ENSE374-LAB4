import foodChain.*;
import java.util.*;

public class lab4
{
	public static void main(String args[])
	{
		map disp = new map();
		
		disp.setBorder();
		disp.Clear();
		disp.populate(1);
		disp.Update();
		disp.Print();
		
		
	}
}