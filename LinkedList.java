public class LinkedList{
    Node head;
    void insert(int key){
        Node newnode = new Node();
        newnode.data = key;
        Node temp = head;
        if(head == null){
            head = newnode;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = null;
        }
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    int search(int key){
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            if(temp.data == key){
                return(temp.data);
            }
            temp = temp.next;
        }
        return(-1);
    }
    
}