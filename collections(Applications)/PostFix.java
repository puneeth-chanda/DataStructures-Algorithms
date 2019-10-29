import java.util.Stack;

public class PostFix{
    public static void main(String[] args){
        PostFix p =new PostFix();
        String[] expr1 = {"2", "3", "5", "*", "+"};
        p.check(expr1);
    }
    public void check(String[] elements){
        Stack<Integer> s = new Stack<Integer>();
        int val,t1,t2;

        for(int i=0;i<elements.length; i++) {
            switch(elements[i]){
                case "*":
                    t2= s.pop();
                    t1= s.pop();
                    s.push(t1*t2);
                    break;
                case "+":        
                    t2= s.pop();
                    t1= s.pop();
                    s.push(t1+t2);
                    break;
                case "-":
                    t2= s.pop();
                    t1= s.pop();
                    s.push(t1-t2);
                    break;
                case "/":
                    t2= s.pop();
                    t1= s.pop();
                    s.push(t1/t2);
                    break;             
                default:
                    s.push(Integer.parseInt(elements[i]));  
            }
        }
        System.out.println(s.peek());
    }
}