package com.lsh.mode11.iterator;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/17 9:41 下午
 * @desc ：
 */
public class LinkedList implements MyCollection  {

    public Node head = null;
    public Node tail = null;
    public int size;

    class Node{
        Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object t) {
        Node node = new Node(t);
        if (head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public MyIterator iterator() {
        MyIterator linkedListIterator = new MyIterator() {
            private Node currentNode = head;
            @Override
            public boolean hasNext() {
                if (currentNode != null) return true;
                return false;
            }

            @Override
            public Object next() {
                Object o = currentNode.o;
                currentNode = currentNode.next;
                return o;
            }
        };
        return linkedListIterator;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 15; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList.size());
        MyIterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
