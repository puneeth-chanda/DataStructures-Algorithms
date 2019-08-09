public class Driver{
    public static void main(String[] args){
        LinkedList l1 =new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3, 2);
        l1.delete(1);
        l1.print();
    }
}