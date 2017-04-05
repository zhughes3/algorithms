package trees;

public interface ITreeNode<E> {
	
	public boolean isLeaf();
	
	public boolean isRoot();
	
	public int getHeight();
	
	public int getDepth();
	
	//how many children does node have
	public int getDegree();
	
	public void setData(E e);
	
	public E getData();
	
}
