package arithmetic.LinkedList;

public class LinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    //为链表设立虚拟头结点
    private Node dummyHead;
    int size;


    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    //获取链表中的元素个数
    public int getSize() {
        return size;
    }

    //返链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }


    //在链表的中间添加元素
    public void add(E e) {
        Node node = new Node(e);

    }


    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed .Illegal index");
        }


        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;

        //上面3句=下面一句
        prev.next = new Node(e, prev.next);

        size++;

    }

    //在链表中添加新的元素e
    public void addFirst(E e) {
        add(0, e);
        size++;
    }


    public void addLast(E e) {
        add(size, e);
    }


    //在链表的index（0-based）位置添加新的元素e
    //在链表中不是一个常用的操作。练习用：)
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed .Illegal index");
        }

        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return cur.e;
    }

    //获得链表的第一个元素
    public E getFirst() {
        return get(0);
    }

    //获得聊表的最后一个元素
    public E getLast() {
        return get(size - 1);
    }

    //修改链表的第index（0-based）个位置的元素为e
    //在链表中不是一个常用的操作
    public void set(int index, E e) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed .Illegal index");
        }

        Node node = dummyHead.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.e = e;
    }

    //查找链表中是否有元素e
    public boolean contains(E e) {
        Node node = dummyHead.next;
//        for(int i=0;i<size;i++){
//            if (node != null){
//                if (node.equals(e)){
//                    return true;
//                }else {
//                    node = node.next;
//                }
//            }
//        }
        while (node != null) {
            if (node.equals(e)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node cur = dummyHead.next;
        while (cur != null) {
            stringBuilder.append(cur + "->");
            cur = cur.next;
        }
        stringBuilder.append("NULL");
        return stringBuilder.toString();
    }

    //从链表中删除index（0-based）位置的元素，返回被删除的元素
    public E remove(int index) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed .Illegal index");
        }

        Node prev = dummyHead;
        Node cur = prev.next;

        Node del = null;
        for (int i = 0; i <= index; i++) {

            if (i == index) {
                del = cur;
                prev.next = cur.next;
                cur.next = null;
                cur = null;
            }
            if (cur != null){
                prev = cur;
                cur = cur.next;
            }

        }

        size -- ;
        return del.e;

    }


    //从链表中删除第一个元素，返回删除的元素
    public E removeFirst() {
        return remove(0);
    }

    //从链表中删除最后一个元素，返回删除的元素
    public E removeEnd() {
        return remove(size - 1);
    }

}