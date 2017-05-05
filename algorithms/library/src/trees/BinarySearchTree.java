package trees;

import java.util.Iterator;

public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E>
{	
	private BinaryTreeNode<E> root;
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public BinarySearchTree(BinaryTreeNode<E> node)
	{
		root = node;
	}

	@Override
	public boolean search(E e) 
	{
		BinaryTreeNode<E> cur = root;
		while(cur != null)
		{
			if(e.compareTo(cur.getData()) == 0)
				return true;
			
			else if(e.compareTo(cur.getData()) == 1)
				cur = cur.getRight();
			
			else if(e.compareTo(cur.getData()) == -1)
				cur = cur.getLeft();
		}
		
		return false;
	}

	@Override
	public void insert(E e) 
	{
		BinaryTreeNode<E> cur = root;
		while(cur != null)
		{
			if(e.compareTo(cur.getData()) == 1)
			{
				if(cur.getRight() == null)
				{
					cur.setRight(new BinaryTreeNode(e, cur));
					break;
				}
				
				else
					cur = cur.getRight();
			}
			
			else 
			{
				if(cur.getLeft() == null)
				{
					cur.setLeft(new BinaryTreeNode(e, cur));
					break;
				}
				
				else
					cur = cur.getLeft();
			}
		}
	}

	@Override
	public int delete(E e) 
	{
		BinaryTreeNode<E> cur = root;
		while(cur != null)
		{
			//found node to delete
			if(e.compareTo(cur.getData()) == 0)
			{
				//node has no children
				if(cur.getDegree() == 0)
				{
					//if e > parent, cur was right child so set parents right child to null
					//otherwise child was left child so set left child of parent to null
					if(e.compareTo(cur.getParent().getData()) == 1)
						cur.getParent().setRight(null);
					else 
						cur.getParent().setLeft(null);
				}
				
				//node had 1 child
				else if(cur.getDegree() == 1)
				{
					if(cur.getParent().getLeft() == null)
						cur.getParent().setLeft(null);
					else 
						cur.getParent().setRight(null);
				}
				
				//node has 2 children, set value of current node to minimum successor and delete minimum successor
				else
				{
					//if e > parent, cur was right child so set parents right child
					//otherwise child was left child so set left child of parent
					if(e.compareTo(cur.getParent().getData()) == 1)
					{
						cur.getParent().getRight().setData((E) new BinarySearchTree(cur.getRight()).getMin());
					}
					else 
						cur.getParent().setLeft(null);
				}
			}
			
			else if(e.compareTo(cur.getData()) == 1)
				cur = cur.getRight();
			
			else if(e.compareTo(cur.getData()) == -1)
				cur = cur.getLeft();
		}
		
		return -1;	
	}
	
	public E getMax()
	{
		return this.getMaxNode().getData();
	}
	
	public void deleteMax()
	{
	
	}
	
	public E getMin()
	{
		return this.getMinNode().getData();
	}
	
	public void deleteMin()
	{
		
	}
	
	@Override
	public void inorder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postorder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preorder() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if(root == null)
			return true;
		
		else 
			return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private BinaryTreeNode<E> getMaxNode()
	{
		BinaryTreeNode<E> cur = root;
		while(cur.getRight() != null)
			cur = cur.getRight();
		
		return cur;
	}
	
	private BinaryTreeNode<E> getMinNode()
	{
		BinaryTreeNode<E> cur = root;
		while(cur.getLeft() != null)
			cur = cur.getLeft();
		
		return cur;
	}
}
