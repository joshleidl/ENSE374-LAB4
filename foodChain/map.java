package foodChain;

import java.util.*;

public class map
{
	public static final char line		= '|';
	public static final char blank 		= ' ';
	public static final char dash		= '-';
	private int max_rows 	= 10000;
	private int max_columns = 10000;
	private int columnInput, rowInput;
	private int row;
	private int column;
	private char field[][];
	private ArrayList<organism> orgList = new ArrayList<>();
	
	public int getRows()
	{
		return row;
	}
	
	public int getCols()
	{
		return column;
	}
	
	private int rowDifference(int input)
	{
		return (max_rows - input);
	}
	
	private int columnDifference(int input)
	{
		return (max_columns - input);
	}
	
	public void setBorder()
	{
		Scanner in = new Scanner(System.in);
		
		try
		{
			System.out.print("Rows: ");
			rowInput = in.nextInt();
			System.out.print("Column: ");
			columnInput = in.nextInt();
			row = rowInput;
			column = columnInput;
		}
		
		catch(InputMismatchException exception)
		{
			System.out.println("Invalid choice.");
		}
	}
	
	public void Clear()
	{
		field = new char[rowInput + 2][columnInput + 2];
		for(int i = 0; i < (rowInput + 2); i++)
		{
			for (int j = 0; j < (columnInput + 1); j++)
			{
				field[i][j] = blank;
			}
		}
	}
	
	public final void Print()
	{
		int i = 0; int j = 0; int k = 0; int l = 0; int q = 0;
		if ((column == 0) && (row == 0))
		{
		}
		else
		{
			if ((i >= 0) || (j >= 0) || (k >= 0) || (l >= 0) || (q >= 0))
			{
				for(i = 0; i < (columnInput + 2); i++)
				{
					System.out.print(dash);
				}
				System.out.print('\n');
			
				for (j = 0; j < (rowInput); j++)
				{
					System.out.print(line);
					for(k = 0; k < (columnInput); k++)
					{
						System.out.print(field[j][k]);//field[j][k]);
					}
					System.out.print(line);
					System.out.print('\n');
				}
			
				for (l = 0; l < (columnInput + 2); l++)
				{
					System.out.print(dash);
				}
				
				System.out.print('\n');
			}
		}
	}
	
	public void Update()
	{
		for(organism temp : orgList)
		{
			field[temp.getRow()][temp.getCol()] = temp.getSymbol();
		}
	}
	
	public void Populate(int density)
	{
		Random generator = new Random();
		
		for(int i = 0; i < rowInput; i++)
		{
			for(int j = 0; j < columnInput; j++)
			{
				if(Math.abs(generator.nextInt()) % 101 < density)
				{
					switch (Math.abs(generator.nextInt()) % 12 + 1)
					{
						case 1:
							orgList.add(new wolf());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 2:
							orgList.add(new fox());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 3:
							orgList.add(new hawk());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 4:
							orgList.add(new caterpillar());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 5:
							orgList.add(new bluejay());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 6:
							orgList.add(new grasshopper());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 7:
							orgList.add(new mouse());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 8:
							orgList.add(new squirrel());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 9:
							orgList.add(new rabbit());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 10:
							orgList.add(new deer());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 11:
							orgList.add(new tree_shrub());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						case 12:
							orgList.add(new grass());
							orgList.get(orgList.size() - 1).setPos(i, j);
							break;
						default:
							System.out.println("this is an invalid organism");
					}
				}
			}
		}
	}
}