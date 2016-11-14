package foodChain;

public class listElement
{
	private organism data;
	private listElement next;
	
	public listElement()
	{
		this.data = 0;
		this.next = null;
	}
	
	public void copy(listElement copyFrom)
	{
		this.data = copyFrom.getData();
		this.next = copyFrom.getNext();
	}
	
	public organism getOrg()
	{
		return this.data;
	}
	
	public void setNext(listElement le)
	{
		this.next = le;
	}
	
	public listElement getNext()
	{
		return this.next;
	}
	
}

