public class MinHeapTest {

    public static void main(String[] args) {
        int[] keys = {5, 3, 8, 6, 2, 1, 7, 9, 4, 0};
        MinHeap m = new MinHeap(keys);
        m.print();  // prints the above array

        m.buildHeap();
        m.print();  // prints 0 2 1 4 3 8 7 9 6 5

        System.out.println( m.extractMin() ); // prints 0
        m.print(); // prints 1 2 5 4 3 8 7 9 6
                   // only 9 elements are printed now
    }
}