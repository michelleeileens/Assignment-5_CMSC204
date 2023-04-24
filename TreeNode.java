/*
 * Class: CMSC204 30416
 * Instructor: Prof. Khandan Monshi
	 * Description:  Morse Code
	 * Due: 2/7/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Michelle Eileen
*/
public class TreeNode<T> {
	private T data;
	protected TreeNode<T> right;
	protected TreeNode<T> left;
	
	public TreeNode() {
	}
	
	public TreeNode(T dataNode) {
		data = dataNode;
		right = null;
		left = null;
	}
	
	public TreeNode(TreeNode<T> node) {
		data = node.data;
		right = node.right;
		left = node.left;
	}
	
	public T getData() {
		return data;
	}
	
}