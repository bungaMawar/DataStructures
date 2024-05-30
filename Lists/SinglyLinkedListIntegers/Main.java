package Lists.SinglyLinkedListIntegers;

public class Main {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();

        list.add(2);
        list.add(1);
        list.add(10);
        list.add(5);

        list.printList();

        list.add(4);
        list.printList();
    }
}
