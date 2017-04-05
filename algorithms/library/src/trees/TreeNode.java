package trees;

public class TreeNode<E> implements ITreeNode<E> {
	
	private TreeNode<E> parent;
	private TreeNode<E> left;
	private TreeNode<E> right;
	private E data;
	private int degree;
	
	public TreeNode(E e) {
		data = e;
	}
	
	public TreeNode(E e, TreeNode<E> parent) {
		data = e;
		this.parent = parent;
	}

	@Override
	public boolean isLeaf() {
		return (left == null && right == null) ? true : false; 
	}

	@Override
	public boolean isRoot() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDepth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDegree() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setData(E e) {
		data = e;
	}

	@Override
	public E getData() {
		return data;
	}
	
	public TreeNode<E> getParent() {
		return parent;
	}
	
	

}
