
/*
*
*                      栈和队列
*
*
*
*
* */
public class TestStack {
    static class Mystack {
        //用顺序表来实现栈  尾插尾删

        //array中[0,size)区间中的元素是栈上的有效元素
        //0号元素相当于栈底，size-1号元素相当于栈顶
        private int[] array = new int[100];
        private int size = 0;

        //进栈：往栈中放入元素  尾插
        public void push(int value) {
            //吧value放到数组末尾，此处没有考虑扩容
            array[size] = value;
            size++;
        }

        //出栈：取栈顶元素 尾删
        public Integer pop() {
            if (size <= 0) {
                return null;
            }
            int ret = array[size - 1];
            size--;//出栈中多了一个size--就是取出元素后直接删除一个size，而取栈中元素不需要size--
            return ret;
        }

        //取栈顶元素
        public Integer peek() {
            if (size <= 0) {
                return null;
            }
            int ret = array[size - 1];
            return ret;
        }
    }


    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);
        while (true) {
            Integer cur = mystack.pop();
            if (cur == null) {
                break;
            }
            System.out.println(cur);
        }
    }

}