package trees;

public class TreeNode<E> implements ITreeNode<E> 
{
	private TreeNode<E> parent;
	private TreeNode<E> left;
	private TreeNode<E> right;
	private E data;
	
	public TreeNode(E e) 
	{
		data = e;
		parent = null;
		left = null;
		right = null;
	}
	
	public TreeNode(E e, TreeNode<E> parent) 
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

	public TreeNode<E> getParent() 
	{
		return parent;
	}
	
	public void setParent(TreeNode<E> node)
	{
		parent = node;
	}
	
	public TreeNode<E> getLeft()
	{
		return left;
	}
	
	public void setLeft(TreeNode<E> node)
	{
		left = node;
	}
	
	public TreeNode<E> getRight()
	{
		return right;
	}
	
	public void setRight(TreeNode<E> node)
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
