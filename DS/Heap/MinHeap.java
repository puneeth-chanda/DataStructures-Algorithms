public class MinHeap{
    int[] arr;
    int size;
    public MinHeap(int[] items){
        arr = items;
        size = arr.length;
    }
    public int get(int i){
        return arr[i];
    }
    public int parent(int i){
        if(i==0){
            return 0;
        }
        else{
            return (i-1)/2;
        }
    }
    public int left(int i){
        if(2*i+1<size){
            return 2*i+1;
        }
        else{
            return -1; 
        }
    }
    public int right(int i){
        if(2*i+2<size){
            return 2*i+2;
        }
        else{
            return -1;
        }
    }
    public int checkProperty(int i) {
        if (left(i) == -1 && right(i) == -1)
            return i;
        else if (right(i) == -1) {
            if (arr[i] < arr[left(i)])
                return i;
            else
                return left(i);
        }
        else if (arr[i] < arr[left(i)] && arr[i] < arr[right(i)])
            return i;
        else if (arr[i] > arr[left(i)] && arr[i] < arr[right(i)])
            return left(i);
        else if (arr[i] < arr[left(i)] && arr[i] > arr[right(i)])
            return right(i);
        else if (arr[left(i)] < arr[right(i)])
            return left(i);
        else
            return right(i);
    }
    public void swap(int i, int j){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i] = temp;
    }
    public void print() {
    for(int i=0;i<size;i++){
        System.out.print(arr[i]);
    }        
    System.out.println();
    }
    public void fixHeap(int i){
        int k = checkProperty(i);
        if(i==k){
            return;
        }
        else{
            swap(i, k);
            fixHeap(k);
        } 
    }
    public void buildHeap(){
        for(int i=(arr.length-2)/2;i>=0;i--){
            fixHeap(i);
        }
    }
    public int extractMin(){
        int val = arr[0];
        arr[0] = arr[size-1];
        fixHeap(0);
        return val;
    }
}