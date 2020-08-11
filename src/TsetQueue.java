public class TsetQueue {
    //用链表实现队列(链表简单)，链表尾部作为队尾（方便插入元素），链表头部作为队首（方便删除元素）
    static class  Node{
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Myqueue{
        Node head = new Node(-1);
        //为了方便实现插入元素，多Node一个引用tail作为尾部
        Node tail = head;


        //入队列（链表尾插）
        public void offer(int data){
            Node newNode = new Node(data);
            tail.next = newNode;
        //插入完毕之后 记得更新tail的指向，始终保持tail指向最后一个节点即链表的尾部
            tail = tail.next;
        }

        //出队列（链表头删）
        public Integer poll(){
            if (head.next == null){
                return  null;
            }
            //head.next = head.next.next;
            Node deleteNode = head.next;
            head.next = deleteNode.next;
            //如果只有两个节点头删完之后 应更新tail = head
            if (head.next == null){
                tail = head;
            }
            return deleteNode.data;
        }

        //取队首元素
        public Integer peek() {
            if (head.next == null) {
                return null;
            }
            return head.next.data;
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
