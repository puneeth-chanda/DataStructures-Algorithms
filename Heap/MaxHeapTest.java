public class MaxHeapTest{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        MaxHeap m = new MaxHeap(arr);
        m.buildHeap();
        m.print();
    }
}