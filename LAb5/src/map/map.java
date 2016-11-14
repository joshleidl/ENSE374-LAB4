package map;

import java.util.*;

public class map
{
	public static final char line		= '|';
	public static final char blank 		= ' ';
	private int row;
	private int column;
	private char field[][];
	
	public void setBorder()
	{
		Scanner in = new Scanner(System.in);
		
		try
		{
			System.out.print("Rows: ");
			int rowInput = in.nextInt();
			System.out.print("Column: ");
			int columnInput = in.nextInt();
			row = rowInput;
			column = columnInput;
		}
		
		catch(InputMismatchException exception)
		{
			System.out.println("Invalid choice.");
		}
		in.close();
	}
	
	public void Clear()
	{
		field = new char[row][column];
		for(int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				field[i][j] = blank;
			}
		}
	}
	
	public final void Print()
	{
		int i = 0; int j = 0; int k = 0; int l = 0; int q = 0;
		if ((column == 0) && (row == 0)){ return; }
		else
		{
			if ((i >= 0) || (j >= 0) || (k >= 0) || (l >= 0) || (q >= 0))
			{
				for(i = 0; i < column + 2; i++)
				{
					System.out.print(line);
				}
				System.out.print('\n');
			
				for (j = 0; j < row; j++)
				{
					System.out.print(line);
					for(k = 0; k < column; k++)
					{
						System.out.print(field[j][k]);
					
					}
					System.out.print(line);
					System.out.print('\n');
				}
			
				for (l = 0; l < column + 2; l++)
				{
					System.out.print(line);
				}
				System.out.print('\n');
			}
			else return;
		}
	}
}