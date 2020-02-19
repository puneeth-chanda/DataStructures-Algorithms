public class Stack{
    public Node head;
    public void push(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }
    public int pop(){
        head = head.next;
        int top = head.data;
        return top;
    }
    public void print(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp  = temp.next;
        }
    }
    /*Reversing the input*/
    public void reverse(){
        Node root2;
        Node temp2 = root2;
        Node temp = head;
        while(temp.next != null){
            temp2.data = temp.data;
            temp2 = temp2.next;
        }
        return root2;
    }
}