package Lists.SinglyLinkedListIntegers;

public class IntNode {
    int number;
    IntNode next;

    public IntNode(int number) {
        this.number = number;
        this.next = null;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public IntNode getNext() {
        return next;
    }
    public void setNext(IntNode next) {
        this.next = next;
    }
}
