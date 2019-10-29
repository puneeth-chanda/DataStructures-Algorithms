import java.util.Stack;
public class BalancedParanthesis{
    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        int arr[] = {4,2,3,0,1,3};
        for(int i=0;i<6;i++){
            if(arr[i]==0||arr[i]==2||arr[i]==4){
                s.push(arr[i]);
            }
            if(arr[i]==1||arr[i]==3||arr[i]==5){
                if(arr[i]-1==s.peek()){
                    s.pop();
                }
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