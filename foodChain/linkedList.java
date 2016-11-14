package foodChain;

public class linkedList
{
	private listElement head;
	private int length;
	
	public linkedList()
	{
		head = null;
		tail = null;
		length = 0;
	}
	
	public void addElement(int data)
	{
		listElement temp = new listElement();
		
		if (this.head == null)
		{	
			listElement toAdd = new listElement(data);
	
			this.head = toAdd;
			this.tail = toAdd;
		}
		else
		{
			tail.setNext(new listElement(data));
			temp = tail;
			tail = tail.getNext();
		}
		
		length++;
	}
	
	public listElement getElement(int index)
	{
		if (index > length - 1 || index < 0)
		{
			return null;
		}
		else
		{
			listElement toReturn = head;
			
			for (int i = 0; i < index; i++)
			{
				toReturn = toReturn.getNext();
			}
			
			return toReturn;
		}
	}
	
	public boolean deleteElement(int index)
	{
		if (index > length - 1 || index < 0)
		{
			return false;
		}
		else if(index == 0)
		{
			//Case we want to delete head
			//Java does not require memory release and will clean up my garbage
			head = head.getNext();
			
			length--;
		}
		else
		{
			listElement beforeDelete = head;
			
			for (int i = 0; i < index - 1; i++)
			{
				beforeDelete = beforeDelete.getNext();
			}
			
			beforeDelete.setNext(beforeDelete.getNext().getNext());
			
			length--;
		}
		
		return true;
	}
	
	public void printList()
	{
		listElement toPrint = head;
		int index = 0;
		
		if (length == 0)
		{
			System.out.println("List is empty!");
		}
		else
		{
			for(; toPrint != null; toPrint = toPrint.getNext())
			{
				System.out.println("Index " + index + ": " + toPrint.getData());
				index++;
			}
			
			System.out.println("");
		}
	}
}
