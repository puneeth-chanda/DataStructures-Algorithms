import java.util.ArrayList;
public class GraphNode{
    int label;
    ArrayList<GraphNode> adjList;
    boolean visited;
    int preOrder;
    int postOrder;
    GraphNode(int l){
        this.label = l;
        adjList = new ArrayList<GraphNode>();
    }
    public void print(){
        for(int i=0;i<adjList.size();i++){
            System.out.print(adjList.get(i).label+"->");
        }
    }
    public int dfs(int visitCount){
        System.out.print(label+"");
        visited= true;
        preOrder = visitCount;

        for(int j=0;j<adjList.size();j++){
            if(!adjList.get(j).visited){
                adjList.get(j).dfs(++visitCount);
            }
        }
        postOrder = ++visitCount;
        return visitCount;
    }
    
}