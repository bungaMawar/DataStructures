package Stacks.ArrayImplementation;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Jane", "Jones", 0));
        stack.push(new Employee("John", "Doe", 001));
        stack.push(new Employee("Mary", "Smith", 002));
        stack.push(new Employee("Will", "Wilson", 003));

        System.out.println(stack.peek());
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();
    }
}
