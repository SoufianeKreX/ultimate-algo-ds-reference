package dataStructures.linkedList;

/**
 * Time complexity
 * linkFirst, linkLast - O(1)
 * linkBetween - O(1)
 * find - O(n)
 */

public class LinkedList {

    private Node first;
    private Node last;

    public class Node {
        private int data;
        protected Node next;

        Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    public void linkFirst(int data) {
        Node old = first;
        first = new Node(data);
        if (last == null) {
            last = first;
        } else {
            first.next = old;
        }
    }

    public void linkLast(int data) {
        Node secLast = last;
        last = new Node(data);
        if (secLast != null) {
            secLast.next = last;
        } else {
            first = last;
        }
    }

    public void linkBetween(int data, Node node) {
        if (node == null) {
            return;
        }
        Node temp = new Node(data);
        temp.next = node.next;
        node.next = temp;
    }

    public Node find(int data) {
        Node current = first;
        while (current != null) {
            if (data == current.getData()) return current;
            current = current.next;
        }
        return null;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }
}
