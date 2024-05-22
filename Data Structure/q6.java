/*class BSTNode{
	int info;
	BSTNode left,right;
	BSTNode(int info){	
		this.info=info;
		left=right=null;
	}
	
}
class Tree{
	BSTNode root;
	Tree(){
		root=null;
	}
	void insert(int info) {
		root=insertRec(root,info);
	}
	BSTNode insertRec(BSTNode root,int info) {
		if(root==null) {
			root=new BSTNode(info);
			return root;
		}
		if(info<root.info) {
			root.left=insertRec(root.left,info);
		}
		if(info>root.info) {
			root.right=insertRec(root.right,info);
		}
		return root;
	}
	boolean isBST() {
		return isbst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	boolean isbst(BSTNode root,int min,int max) {
		if(root==null) {
			return true;
		}
		if(root.info<min || root.info>max) {
			return false;
		}
		return (isbst(root.left,min,root.info-1) && isbst(root.right,root.info+1,max));
	}
}
public class q6 {

	public static void main(String[] args) {
		Tree b=new Tree();
		b.insert(2);
		b.insert(9);
		b.insert(1);
		b.insert(8);
		b.insert(10);
		System.out.println(b.isBST());
	}

}*/
