package trees;

public class BSTTest {

	public static void main(String[] args) 
	{
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(40); 
		bst.insert(20);
		bst.insert(60);
		bst.insert(10);
		bst.insert(30);
		bst.insert(50);
		bst.insert(70);
		bst.insert(1);
		bst.deleteMin();
		System.out.println(bst.inorder());
		System.out.println(bst.preorder());
		System.out.println(bst.postorder());
	}

}
