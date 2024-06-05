package Queues.ArrayImplementation;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jane", "Jones", 001);
        Employee e2 = new Employee("John", "Doe", 002);
        Employee e3 = new Employee("Mary", "Smith", 003);
        Employee e4 = new Employee("Will", "Smith", 004);

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(e1);
        queue.add(e2);
        queue.add(e3);
        queue.add(e4);

        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println(queue.peek());
    }
}
