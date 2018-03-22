
public class TreeNode {
	private Card data;
	private TreeNode left; //left subtree
	private TreeNode right; //right subtree
	
	public TreeNode() {
		this(null);
	}
	
	public TreeNode(Card data) {
		this(data,null,null);
	}
	
	public TreeNode(Card data, TreeNode left, TreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	
	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

	public Card getData() {
		return data;
	}
	public void setData(Card data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	

}
