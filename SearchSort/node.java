/*
 * Node (element) class: building block of ADTs,
 * specifically for linked (list) implementations
 */

class Node {
    int data;
    Node next; // (self-reference)

    public Node(int d) // constructor <- allows you to create
    { // a node AND initialise its data at
        data = d; // the same time (with one line of code).
        next = null; // like: Node n = new Node(5);
    }

    public boolean hasNext() {
        if (next == null)
            return false;
        else
            return true;

        // OR // return next != null;
    }

    public String toString() {
        return "" + data;
    }

}
/*
 * Stack ADT - Linked implementation
 *
 */

public class node {
    Node top;

    public boolean isEmpty() {
        if (top == null)
            return true;
        else
            return false;
        // or, in short: return top == null;
    }

    public void push(int d) {
        Node newNode = new Node();
        newNode.data = d;
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int d = top.data;
            top = top.next;
            return d;
        } else {
            System.out.println("Stack empty!");
            return -1;
        }
    }

    public int peek() {
        return top.data;
    }

    public void printStack() {
        Node temp = top;
        if (temp != null) {
            System.out.println("Top\n---");
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        IBIO.output("yeet");
    }

}