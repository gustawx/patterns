package com.company;

public class Node {
    private int value;
    private Node next;

    public Node(int value, Node head){
        this.value = value;
        this.next = head;
    }

    public void reverse(){
        Node current = this; // N1
        Node tmp = current.next; // N2
        Node currentAfterReverse = null;
        while (tmp != null) {
            next = currentAfterReverse; // next w N1 jest teraz null
            currentAfterReverse = current;
            current = tmp;
            tmp = current.next;
        }
    }

    @Override
    public String toString() {
        return String.valueOf("Node: "+this.next);
    }
}
