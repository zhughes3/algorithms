package list;

public class LinkedList<E> implements List<E> {
	
	private int length;
	Node<E> head;
	
	public LinkedList()
	{
		length = 0;
		head = null;
	}
	
	public LinkedList(E e)
	{
		this.head = new Node(e, null);
		length = 1;
	}

	@Override
	//insert element to the front of the list
	public void add(E e) 
	{
		if(length == 0)
			head = new Node<E>(e, null);
		
		else
			head = new Node<E>(e, head);
		
		length++;
	}

	@Override
	//insert element to a given index in the list
	public void add(int idx, E e) 
	{
		if(idx >= length || idx < 0)
			throw new IndexOutOfBoundsException();
		
		else if(idx == 0)
			this.add(e);			
			
		else
		{
			Node<E> newNode = new Node(e, this.getNode(idx-1).getNext());
			this.getNode(idx-1).setNext(newNode);
			length++;
		}
	}

	@Override
	//returns value at a given index
	public E get(int idx) 
	{
		if(idx >= length || idx < 0)
			throw new IndexOutOfBoundsException();
		
		else
			return getNode(idx).getData();
	}
	
	@Override
	//returns index of first occurence of e; 
	//return -1 if not found
	public int indexOf(E e) 
	{
		Node<E> cur = head;
		for(int i = 0; i < length; i++)
		{
			if(cur.getData() == e)
				return i;
			
			else
				cur = cur.getNext();
		}
		return -1;
	}

	@Override
	//returns true is list is empty, false otherwise
	public boolean isEmpty() 
	{
		if(length == 0)
			return true;
		
		else 
			return false;
	}

	@Override
	//remove node at given index
	public void remove(int idx) 
	{
		if(idx >= length || idx < 0)
			throw new IndexOutOfBoundsException();
		
		else if(idx == 0)
			head = head.getNext();
		
		else if(idx == length-1)
			this.getNode(idx-1).setNext(null);
		
		else
			this.getNode(idx-1).setNext(this.getNode(idx).getNext());	
		
		length--;
	}

	@Override
	//removes first occurence of e;
	//returns 0 if e is found, returns -1 if e is not found
	public int remove(E e) 
	{
		Node<E> cur = head;
		for(int i = 0; i < length; i++)
		{
			if(cur.getData() == e)
			{
				this.remove(i);
				return 0;
			}
			
			else
				cur = cur.getNext();
		}
		
		return -1;
	}

	@Override
	//removes all nodes from the list by setting the head to null
	public void removeAll() 
	{
		head = null;
		length = 0;
	}

	@Override
	//returns length of the list
	public int getLength() 
	{
		return length;
	}

	//returns node at a given index
	private Node<E> getNode(int idx)
	{
		if(idx >= length || idx < 0)
			throw new IndexOutOfBoundsException();
		
		Node<E> cur = head;
		int i = 0;
		while(i < idx)
		{
			cur = cur.getNext();
			i++;
		}
		
		return cur;
	}
	
	//prints a string representation of current state of the list
	//prints each node as: [current_pointer, value, next_pointer] with the head appearing as the left-most node
	public String printList()
	{
		String print = "";
		Node<E> cur = head;
		int i = 0;
		while(i < length)
		{
			if(cur.getNext() != null)
				print += "[" + cur.toString() + ", " + cur.getData().toString() + ", " + cur.getNext().toString() + "]";
			
			else
				print += "[" + cur.toString() + ", " + cur.getData().toString() + ", null]";
			cur = cur.getNext();
			i++;
		}
		
		return print;
	}
}
