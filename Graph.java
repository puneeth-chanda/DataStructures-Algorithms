
public class Graph {
	Node[] n;
	int size;
	Graph(int n)
	{
		size=n;
		this.n=new Node[size];
		for(int i=0;i<n;i++)
			this.n[i]=new Node(i);
	}
	void addEdge(int i,int j)
	{
		n[i].add(n[j]);
	}
	void dfs()
	{
		for (int i=0;i<size;i++)
		{
			if(!n[i].visited)
				n[i].dfs();
		}
	}
	void print()
	{
		for (int i=0;i<size;i++)
		{
			System.out.println("the contents of "+ i +"are");
			System.out.println(n[i].data);
			System.out.println("the adj list of "+ i +"are");
			n[i].print();
		}
	}
	void reset()
	{
		for(int i=0;i<size;i++)
			n[i].reset();
	}
	void bfs() {
		for(int i =0;i<size;i++) {
			n[i].bfs();
		}
	}

}
