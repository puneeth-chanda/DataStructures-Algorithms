
public class Driver {
    public static void main(String[] args) {
        BST b = new BST();
	
	int[] arr = {50, 20, 80, 10, 30, 5, 15, 25, 35, 70, 90, 65,75, 85, 95};
	for (int i=0; i< arr.length; i++){
	    b.insert(arr[i]);
	}
	System.out.println( b.search(43) );  // prints false
	System.out.println( b.search(70) );  // prints true
	System.out.println(b.height());
	b.inorder();	
}
}
