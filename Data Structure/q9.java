import java.util.*;

public class q9 {
	static class Graph{
		int vertices;
		boolean visited[];
		LinkedList<Integer> adjlist[];
		Graph(int v){
			this.vertices=v;
			adjlist=new LinkedList[vertices];
			for(int i=0;i<vertices;i++) {
				adjlist[i]=new LinkedList<>();
			}
			visited=new boolean[vertices];
		}
		void addEdge(int src,int dst) {
			adjlist[src].add(dst);
			adjlist[dst].add(src);
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
		void dfs(int start) {
			Arrays.fill(visited, false);
			dfsHelper(start);
		}
		void dfsHelper(int start) {
			visited[start]=true;
			System.out.print(start+" ");
			for(int i=0;i<adjlist[start].size();i++) {
				if(!visited[i]) {
					dfsHelper(i);
				}
				else {
					
				}
			}
		}
		void bfs(int start) {
			boolean visited[]=new boolean[vertices];
			Queue<Integer> q=new LinkedList<>();
			visited[start]=true;
			q.add(start);
			while(!q.isEmpty()) {
				int vertex=q.poll();
				System.out.println(vertex+" ");
				for(int i=0;i<adjlist[start].size();i++) {
					if(!visited[i]) {
						visited[i]=true;
						q.add(i);
					}
				}
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
		g.printList();
		g.dfs(0);
		g.bfs(0);
	}

}
