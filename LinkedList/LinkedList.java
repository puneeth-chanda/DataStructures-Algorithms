public class LinkedList{
    Node head;
    void insert(int key){
        Node newnode = new Node(key);
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
    void insert(int key, int pos){
        Node newnode = new Node(key);
        Node temp = head;
        if(pos == 0){
            newnode.next = temp;
            head = newnode;
        }
        else{
            for(int i=0;i<pos-1;i++){
                temp = temp.next;
            }
            Node temp1 = temp.next;
            temp.next = newnode;
            newnode.next = temp1;
        }
    }
    void delete(int key){
        Node temp = head;
        if(temp.data==key){
            head=temp.next;
        }
        else{
        while(temp.next.data!=key){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}
    void insertFirst(int key){
        Node newnode =new Node(key);
        Node temp = head;
        newnode.next = temp;
        head = newnode;
    }
    void deleteFirst(){
        head = head.next;
    }
    int size(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}