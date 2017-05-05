package trees;

public class BinaryTreeNode<E> implements IBinaryTreeNode<E> 
{
	private BinaryTreeNode<E> parent;
	private BinaryTreeNode<E> left;
	private BinaryTreeNode<E> right;
	private E data;
	
	public BinaryTreeNode(E e) 
	{
		data = e;
		parent = null;
		left = null;
		right = null;
	}
	
	public BinaryTreeNode(E e, BinaryTreeNode<E> parent) 
	{
		data = e;
		this.parent = parent;
		left = null;
		right = null;
	}

	@Override
	public boolean isRoot() 
	{
		if(parent == null)
			return true;
		
		else 
			return false;
	}

	@Override
	public boolean isLeaf() 
	{
		if(left == null && right == null)
			return true;
		
		else 
			return false;
	}

	@Override
	public E getData() 
	{
		return data;
	}

	@Override
	public void setData(E e) 
	{
		data = e;
	}

	public BinaryTreeNode<E> getParent() 
	{
		return parent;
	}
	
	public void setParent(BinaryTreeNode<E> node)
	{
		parent = node;
	}
	
	public BinaryTreeNode<E> getLeft()
	{
		return left;
	}
	
	public void setLeft(BinaryTreeNode<E> node)
	{
		left = node;
	}
	
	public BinaryTreeNode<E> getRight()
	{
		return right;
	}
	
	public void setRight(BinaryTreeNode<E> node)
	{
		right = node;
	}

	@Override
	//return number of children of node
	public int getDegree() 
	{
		int degree = 2;
		
		if(left == null)
			degree--;
		
		if(right == null)
			degree--;
		
		return degree;
	}

	@Override
	public int getHeight() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDepth() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
