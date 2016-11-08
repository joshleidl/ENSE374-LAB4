package map;

import java.util.*;

public class map
{
	public static final char line		= '|';
	public static final char blank 		= ' ';
	private int max_rows 	= 10;
	private int max_columns = 10;
	private int row;
	private int column;
	private char[][] field;
	
	public int rowDifference(int input)
	{
		int result;
		result = max_rows - input;
		return result;
	}
	
	public int columnDifference(int input)
	{
		int result;
		result = max_columns - input;
		return result;
	}
	
	public void setBorder()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Rows: ");
		int rowInput = in.nextInt();
		System.out.print("Column: ");
		int columnInput = in.nextInt();
		row = rowDifference(rowInput);
		column = rowDifference(columnInput);
		in.close();
	}
	
	public void Clear()
	{
		field = new char[max_rows][max_columns];
		for(int i = 0; i < (max_rows - rowDifference(row)); i++)
		{
			for (int j = 0; j < (max_columns - columnDifference(column)); j++)
			{
				field[i][j] = blank;
			}
		}
	}
	
	public final void Print()
	{
		int i = 0; int j = 0; int k = 0; int l = 0;
		if ((i >= 0) || (j >= 0) || (k >= 0) || (l >= 0))
		{
			
			for(i = 0; i < (max_columns - columnDifference(column)) + 2; i++)
			{
				System.out.print(line);
			}
			System.out.print('\n');
			
			for (j = 0; j < (max_rows - rowDifference(row)); j++)
			{
				System.out.print(line);
				for(k = 0; k < (max_columns - columnDifference(column)); k++)
				{
					System.out.print(field[j][k]);
				}
				System.out.print(line);
				System.out.print('\n');
			}
			
			for (l = 0; l < (max_columns - columnDifference(column)) + 2; l++)
			{
				System.out.print(line);
			}
			System.out.print('\n');
		}
		
		else 
			return;
	}
}