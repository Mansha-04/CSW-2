class BSTNode{
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
	void delete(int info) {
		root=deleteRec(root,info);
	}
	BSTNode deleteRec(BSTNode root,int info) {
		if(root==null) {
			return root;
		}
		if(info<root.info) {
			root.left=deleteRec(root.left,info);					
		}
		if(info>root.info) {
			root.right=deleteRec(root.right,info);
		}
		else {
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			root.info=min(root.right);
			root.right=deleteRec(root.right,root.info);
		}
		return root;
	}
	int min(BSTNode root) {
		int m=root.info;
		while(root.left!=null) {
			m=root.left.info;
			root=root.left;
		}
		return m;
	}
	void inorder() {
		inorderRec(root);
	}
	void inorderRec(BSTNode root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.info+" ");
			inorderRec(root.right);
		}
	}
}
public class q7 {

	public static void main(String[] args) {
		Tree t=new Tree();
		t.insert(2);
		t.insert(9);
		t.insert(3);
		t.insert(1);
		t.insert(6);
		System.out.println("original");
		t.inorder();
		t.delete(9);
		System.out.println();
		System.out.println("after deletion");
		t.inorder();
		
	}

}
