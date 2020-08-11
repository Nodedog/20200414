public class TestQueue2 {
    //基于顺序表实现队列
    static class Myqueue{
        private int[] array = new int[100];
        private int head = 0;
        private int tail = 0;
        private int size = 0;

        //入队列
        public boolean offer(int value){
            if (size == array.length){
                return false;
            }
            array[tail] = value;
            tail++;
            //如果tail++之后超过length则让tail返回array的零号下标
            if (tail >= array.length){
                tail = 0;
            }
            size++;
            return true;
        }

        //出队列
        public Integer poll(){
            if (size == 0){
                return null;
            }
            int ret = array[head];
            head++;
            if (head >= array.length){
                head = 0;
            }
            size--;
            return ret;
        }

        //取队首元素
        public Integer peek(){
            if (size == 0){
                return null;
            }
            return array[head];
        }
    }


    public static void main(String[] args) {
        Myqueue myqueue = new Myqueue();
        myqueue.offer(1);
        myqueue.offer(2);
        myqueue.offer(3);
        myqueue.offer(4);
        myqueue.offer(5);
        while (true){
            Integer cur = myqueue.poll();
            if (cur == null){
                break;
            }
            System.out.println(cur);
        }

    }

}
