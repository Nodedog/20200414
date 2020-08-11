public class TestStack2 {
    //使用链表也能实现栈，用链表头部表示栈顶，链表尾部表示栈底
    static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }


    static class Mystack{
        //Node了一个傀儡头结点
        private Node head = new Node(-1);

        //进栈：采用头插
        public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
        }

        //出栈：采用头删
        public Integer pop(){
            Node deleteNode = head.next;
            if (head.next == null){
                return null;
            }
            head.next = deleteNode.next;
            return deleteNode.data;
        }

        //取栈顶元素
        public Integer peek(){
            if (head.next ==  null){
                return  null;
            }
            return head.next.data;
        }
    }

    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);
        while (true){
            Integer cur = mystack.pop();
            if (cur == null) {
                break;
            }
            System.out.println(cur);
        }

    }
}
