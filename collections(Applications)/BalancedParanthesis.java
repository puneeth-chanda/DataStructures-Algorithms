import java.util.Stack;
public class BalancedParanthesis{
    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        int arr[] = {0,0,1,0,1,0};
        for(int i=0;i<6;i++){
            if(arr[i]==0){
                s.push(arr[i]);
            }
            if(arr[i]==1){
                s.pop();
            }
        }
        if(s.isEmpty()){
            System.out.println("it is empty bro");
        }
        else{
            System.out.println("Sorry dude!:(");
        }
}
}