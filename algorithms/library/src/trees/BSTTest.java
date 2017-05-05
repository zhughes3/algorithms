package trees;

public class BSTTest {

	public static void main(String[] args) 
	{
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(10); 
		bst.insert(5);
		bst.insert(15);
		bst.deleteMin();
	}

}
