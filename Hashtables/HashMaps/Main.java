package Hashtables.HashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jane", "Jones", 001);
        Employee e2 = new Employee("John", "Doe", 002);
        Employee e3 = new Employee("Mary", "Smith", 003);
        Employee e4 = new Employee("Will", "Wilson", 004);

        Map<String, Employee> hashMap = new HashMap<>();

        hashMap.put("Jones", e1);
        hashMap.put("Doe", e2);
        hashMap.put("Smith", e3);
        hashMap.put("Doe", e4);
        hashMap.putIfAbsent("Doe", e3);
        System.out.println(hashMap.getOrDefault("Someone", e1));

        System.out.println(hashMap.remove("Jones"));

        Iterator<Employee> itr = hashMap.values().iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));
    }
}
