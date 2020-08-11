import java.util.LinkedList;
import java.util.Queue;

public class TestQueue3 {
    public static void main(String[] args) {

        //标准库中的Queue是基于链表实现的
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);


        while (!queue.isEmpty()){
            Integer cur = queue.poll();
            System.out.println(cur);
        }
    }
}
