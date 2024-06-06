package Hashtables.Chaining;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jane", "Jones", 001);
        Employee e2 = new Employee("John", "Doe", 002);
        Employee e3 = new Employee("Mary", "Smith", 003);
        Employee e4 = new Employee("Will", "Wilson", 004);
        Employee e5 = new Employee("Will", "End", 005);

        ChainedHashtable ht = new ChainedHashtable();

        ht.put("Jones", e1);
        ht.put("Doe", e2);
        ht.put("Smith", e3);
        ht.put("Wilson", e4);
        ht.put("End", e5);

        //ht.printHashTable();

        System.out.println("Retrive key: " + ht.get("Wilson"));

        ht.remove("Jones");
        ht.remove("Smith");
        ht.printHashTable();
    }
}
