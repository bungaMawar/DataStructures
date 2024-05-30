package Lists.DoublyLinkedLists;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if(head == null){
            tail = node;
        } else{
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head;

        if(head.getNext() == null){
            tail = null;
        } else{
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrevious() == null){
            head = null;
        } else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setNext(null);
        return removedNode;

    }

    public void addToEnd(Employee e){
        EmployeeNode node = new EmployeeNode(e);
        if(tail == null){
            head = node;
        } else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public boolean addBefore(Employee e, Employee ee){
        EmployeeNode newEmployee = new EmployeeNode(e);
        EmployeeNode existingEmployee = head;

        while(!existingEmployee.getEmployee().equals(ee) && existingEmployee != null){
            existingEmployee = existingEmployee.getNext();
        }
        if(existingEmployee == null){
            return false;
        }

        if(existingEmployee == head){
            addToFront(e);
            return true;
        }

        EmployeeNode prev = existingEmployee.getPrevious();
        prev.setNext(newEmployee);
        newEmployee.setPrevious(prev);
                
        existingEmployee.setPrevious(newEmployee);
        newEmployee.setNext(existingEmployee); 
        size++;
        return true;       
        
    }

    public void printList(){
        EmployeeNode current = head;
        while(current != null){
            System.out.print(current + " <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
