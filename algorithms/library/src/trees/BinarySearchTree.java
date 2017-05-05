package trees;

import java.util.Iterator;

public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E> implements Comparable<TreeNode<E>>{
	
	private TreeNode<E> root;

	@Override
	public boolean search(E e) 
	{
		TreeNode<E> cur = root;
		while(cur != null)
		{
			if(cur.getData() == e)
				return true;
			
			else if(e > cur.getData())
				cur = cur.getRight();
		}
	}

	@Override
	public boolean insert(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(E e) {
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
