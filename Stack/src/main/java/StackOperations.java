import java.util.Stack;

public class StackOperations {
    private Stack<Integer> stack = new Stack<Integer>();
    public int add(int value){
        try{
            stack.push(value);
            return 1;
        }
        catch (Exception e){

            return 0;
        }
    }

    public int length() {
        return stack.size();
    }

    public void remove() {
        try{
            stack.pop();
        }
        catch(Exception e){
            System.out.println("Hata");

        }
    }

    public int getData() {
        return stack.peek();
    }
}
