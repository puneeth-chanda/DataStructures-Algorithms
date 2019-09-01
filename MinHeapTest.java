public class MinHeapTest {
    public static void main(String[] args) {
        int[] keys = {5, 3, 8, 6, 2, 1, 7, 9, 4, 0};
        MinHeap m = new MinHeap(keys);
        m.print();  // 5 3 8 6 2 1 7 9 4 0

        int j = m.checkProperty(0);
        System.out.println(j);
        if (j != 0)
            m.swap(0,j);
            
        m.print(); // prints 3 5 8 6 2 1 7 9 4 0
        System.out.println( m.checkProperty(2) );  // prints 5   
    }
}