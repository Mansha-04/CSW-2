import java.util.*;
public class q8 {
	static class Graph{
		int vertices;
		int adj[][];
		LinkedList<Integer> adjlist[];
		Graph(int v){
			this.vertices=v;
			adj=new int[vertices][vertices];
			adjlist=new LinkedList[vertices];
			for(int i=0;i<vertices;i++) {
				adjlist[i]=new LinkedList<>();
			}
		}
		void addEdge(int src,int dst) {
			adj[src][dst]=1;
			adj[dst][src]=1;
			adjlist[src].add(dst);
			adjlist[dst].add(src);
		}
		void printMatrix() {
			for(int i=0;i<vertices;i++) {
				for(int j=0;j<vertices;j++) {
					System.out.print(adj[i][j]+" ");
				}
				System.out.println();
			}
		}
		void printList() {
			for(int i=0;i<vertices;i++) {
				System.out.print(i+"->");
				for(int j=0;j<adjlist[i].size();j++) {
					System.out.print(adjlist[i].get(j)+"->");
				}
				System.out.println("null");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of vertices");
		int n=sc.nextInt();
		Graph g=new Graph(n);
		for(int i=0;i<n;i++) {
			System.out.println("enter edge u-v");
			int u=sc.nextInt();
			int v=sc.nextInt();
			g.addEdge(u, v);
		}
		g.printMatrix();
		g.printList();


	}

}
