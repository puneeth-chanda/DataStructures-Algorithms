import java.util.ArrayList;
import java.util.*;
public class Node {
	int data;
	ArrayList<Node> adj;
	boolean visited;
	Node(int l)
	{
		data=l;
		adj=new ArrayList<Node>();
		visited=false;
	}
	void add(Node x)
	{
		adj.add(x);
	}
	void print()
	{
		int l=adj.size();
		for(int i=0;i<l;i++)
			System.out.println(adj.get(i).data);
	}
	public void dfs()
	{
		System.out.println(data+" ");
		visited=true;
		for(int j=0;j<adj.size();j++)
		{
			if(!adj.get(j).visited)
				adj.get(j).dfs();
		}
	}
	void reset()
	{
		visited=false;
	}
	
	void bfs()
	{
		Deque<Node> deque=new ArrayDeque<Node>();
		deque.addFirst(this);
		int l=adj.size();
		for(int i=0;i<l;i++)
		{
			deque.addLast(adj.get(i));
		}
		while(!deque.isEmpty())
		{
			Node c=deque.removeLast();
			if(c.visited==false)
				System.out.println(c.data+" ");
			c.visited=true;
		}
	}

}
