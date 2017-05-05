package list;

public class Node<E>
{
	private E data;
	private Node<E> next;
	
	public Node(E element, Node<E> next)
	{
		data = element;
		this.next = next;
	}
	
	public void setData(E e)
	{
		data = e;
	}
	
	public E getData()
	{
		return data;
	}
	
	public void setNext(Node<E> node)
	{
		next = node;
	}
	
	public Node<E> getNext()
	{
		return next;
	}
}
