import java.util.Stack;

public class TestStack3 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        //标准库中的Stack 如果针对空栈进行pop或peek 就会抛出一个EmptyStackException
        while (!stack.empty()){
            Integer cur = stack.pop();
            System.out.println(cur);
        }
        //由于标准库中的Stack是继承Vector的类 所有Vector能进行的操作，Stack也能
    }
}
