package Lists.SinglyLinkedListIntegers;

public class IntLinkedList {
    IntNode head;
    /**
     * add numbers in sorted order
     * @param num number to be added in linked list
     */
    public void add(int num){
        IntNode newNode = new IntNode(num);

        if(head == null){
            head = newNode;
            return;
        }

        if(num < head.getNumber()){
            newNode.setNext(head);
            head = newNode;
            return;
        }

        IntNode itr = head;
        while(itr.getNext() != null){
            if(itr.getNext().getNumber() > num){
                break;
            }
            itr = itr.getNext();
        }

        newNode.setNext(itr.getNext());
        itr.setNext(newNode);
    }

    public void printList(){
        IntNode itr = head;
        while(itr != null){
            System.out.print(itr.getNumber() + " -> ");
            itr = itr.getNext();
        }
        System.out.println("null");
    }
}
