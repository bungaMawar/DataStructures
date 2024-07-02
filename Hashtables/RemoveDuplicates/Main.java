package Hashtables.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        Employee e1 = new Employee("Jane", "Jones", 001);
        Employee e2 = new Employee("John", "Doe", 002);
        Employee e3 = new Employee("Mary", "Smith", 003);
        Employee e4 = new Employee("Will", "Wilson", 004);
        Employee e5 = new Employee("Will", "End", 005);
        Employee e6 = new Employee("Jane", "Doe", 002);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        employees.forEach(e -> System.out.println(e));

        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employeeTable.containsKey(employee.getIdNum())){
                remove.add(employee);
            } else{
                employeeTable.put(employee.getIdNum(), employee);
            }
        }

        for(Employee employee: remove){
            employees.remove(employee);
        }

        System.out.println("-------------------");
        employees.forEach(e->System.out.println(e));
    }
}
