package list;

public class LinkedList<E> implements List<E> {
	
	private int size;
	Node<E> head;
	
	public LinkedList()
	{
		size = 0;
		head = null;
	}
	
	public LinkedList(E e)
	{
		this.head = new Node(e, null);
		size = 1;
	}

	@Override
	//insert element to the front of the list
	public void add(E e) 
	{
		if(size == 0)
			head = new Node<E>(e, null);
		
		else
			head = new Node<E>(e, head);
		
		size++;
	}

	@Override
	public void add(int idx, E e) 
	{
		if(idx >= size || idx < 0)
			throw new IndexOutOfBoundsException();
		
		else if(idx == 0)
			this.add(e);			
			
		else
		{
			Node<E> newNode = new Node(e, this.getNode(idx-1).getNext());
			this.getNode(idx-1).setNext(newNode);
			size++;
		}
	}

	@Override
	public E get(int idx) 
	{
		if(idx >= size || idx < 0)
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
		for(int i = 0; i < size; i++)
		{
			if(cur.getData() == e)
				return i;
			
			else
				cur = cur.getNext();
		}
		return -1;
	}

	@Override
	public boolean isEmpty() 
	{
		if(size == 0)
			return true;
		
		else 
			return false;
	}

	@Override
	public void remove(int idx) 
	{
		if(idx >= size || idx < 0)
			throw new IndexOutOfBoundsException();
		
		else if(idx == 0)
			head = head.getNext();
		
		else if(idx == size-1)
			this.getNode(idx-1).setNext(null);
		
		else
			this.getNode(idx-1).setNext(this.getNode(idx).getNext());	
		
		size--;
	}

	@Override
	//removes first occurence of e;
	//returns 0 if e is found, returns -1 if e is not found
	public int remove(E e) 
	{
		Node<E> cur = head;
		for(int i = 0; i < size; i++)
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
	public void removeAll() 
	{
		head = null;
		size = 0;
	}

	@Override
	public int getSize() 
	{
		return size;
	}

	private Node<E> getNode(int idx)
	{
		if(idx >= size || idx < 0)
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
	
	public String printList()
	{
		String print = "";
		Node<E> cur = head;
		int i = 0;
		while(i < size)
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
