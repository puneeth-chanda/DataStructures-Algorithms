import java.util.LinkedList;

public class HashTable{
    int size =997;
    LinkedList<HashNode> hash[];
    HashTable(){
        hash = new LinkedList<HashNode>[size];
        for(int i=0;i<size;i++){
            hash[i] = new LinkedList<HashNode>();
        }
    }
}