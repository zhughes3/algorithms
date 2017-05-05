package trees;

public interface IBinaryTreeNode<E> {
	
	public boolean isLeaf();
	
	public boolean isRoot();
	
	public int getHeight();
	
	public int getDepth();
	
	//how many children does node have
	public int getDegree();
	
	public void setData(E e);
	
	public E getData();
	
	public BinaryTreeNode<E> getLeft();
	
	public BinaryTreeNode<E> getRight();
	
	public void setLeft(BinaryTreeNode<E> node);

	public void setRight(BinaryTreeNode<E> node);	
}
