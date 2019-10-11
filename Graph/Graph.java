public class Graph{
    GraphNode[] node;
    int size;
    public Graph{
        size = n;
        node = new GraphNode[size];
        for (int i=0;i<size;i++){
            node[i] = new GraphNode(i);
        }
    }
    public void addEdge(int from, int to){
        node[from].adjList.add(node[to]);
    }
    
}