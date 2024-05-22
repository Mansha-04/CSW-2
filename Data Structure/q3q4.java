/*class Country{
	String name;
	int population;
	Country(String name,int population){
		this.name=name;
		this.population=population;
	}
	void set(String name,int population) {
		this.name=name;
		this.population=population;

	}
	String getName() {
		return name;
	}
	int getPop() {
		return population;
	}
}
class BNode{
	Country info;
	BNode left,right;
	BNode(Country info){	
		this.info=new Country(info.getName(),info.getPop());
		left=right=null;
	}
	BNode(BNode b){
		this.info=new Country(b.info.getName(),b.info.getPop());
		
	}
	
}
class BST{
	BNode root;
	BST(){
		root=null;
	}
	void insert(Country info) {
		root=insertRec(root,info);
	}
	BNode insertRec(BNode root,Country info) {
		if(root==null) {
			root=new BNode(info);
			return root;
		}
		if(info.population<root.info.population) {
			root.left=insertRec(root.left,info);
		}
		if(info.population>root.info.population) {
			root.right=insertRec(root.right,info);
		}
		return root;
	}
	void inorder() {
		inorderRec(root);
	}
	void inorderRec(BNode root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.println(root.info.name+" "+root.info.population);
			inorderRec(root.right);
		}
	}
	void print() {
		int h=height(root);
		for(int i=1;i<=h;i++) {
			printcurrent(root,i);
		}
	}
	int height(BNode root) {
		if(root==null) {
			return 0;
		}
		else {
			int l=height(root.left);
			int r=height(root.right);
			if(l>r) {
				return l+1;
			}
			else {
				return r+1;
			}
		}
	}
	void printcurrent(BNode root,int level) {
		if(root==null) {
			return;
		}
		if(level==1) {
			System.out.print(root.info.name+" ");
		}
		if(level>1) {
			printcurrent(root.left,level-1);
			printcurrent(root.right,level-1);

		}
	}
	void Max() {
		BNode cur=new BNode(findMax(root));
		System.out.println("max = "+cur.info.name);
	}
	BNode findMax(BNode root) {
		if(root==null) {
			return root;
		}
		while(root.right!=null) {
			root=root.right;
		}
		return root;
	}
}
public class q3q4 {

	public static void main(String[] args) {
		Country c1=new Country("A",100);
		Country c2=new Country("B",200);
		Country c3=new Country("C",300);
		Country c4=new Country("D",400);
		BST b=new BST();
		b.insert(c1);
		b.insert(c4);
		b.insert(c3);
		b.insert(c2);
		b.inorder();
		b.Max();
		b.print();

	}

}*/
