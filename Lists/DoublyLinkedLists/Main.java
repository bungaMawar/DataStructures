package Lists.DoublyLinkedLists;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jane", "Jones", 001);
        Employee e2 = new Employee("John", "Doe", 002);
        Employee e3 = new Employee("Mary", "Smith", 003);
        Employee e4 = new Employee("Will", "Smith", 004);
    
        EmployeeLinkedList list = new EmployeeLinkedList();
    
        list.addToFront(e1);
        list.addToFront(e2);
        list.addToFront(e3);
        list.addToFront(e4);   

        System.out.println("Size: " + list.getSize());

        list.printList();

        list.removeFromFront();
        list.printList();

        Employee e5 = new Employee("Bill", "End", 005);
        list.addToEnd(e5);
        list.printList();
        System.out.println("Size: " + list.getSize());
        
        // list.removeFromFront();
        // list.printList();

        // list.removeFromEnd();
        // list.printList();
        // System.out.println("Size: " + list.getSize());

        list.addBefore(e4, e3);
        list.printList();
    }
}
