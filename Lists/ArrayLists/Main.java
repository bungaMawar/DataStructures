package Lists.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jones", 001));
        employeeList.add(new Employee("John", "Doe", 002));
        employeeList.add(new Employee("Mary", "Smith", 003));
        employeeList.add(new Employee("Will", "Smith", 004));

        //printing using lambda
        // employeeList.forEach(employee -> System.out.println(employee));

        // System.out.println(employeeList.get(1));

        // System.out.println(employeeList.isEmpty());

        //replacing items
        employeeList.set(1, new Employee("John", "Adams", 005));

        //employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        //adding at specific index

        employeeList.add(3, new Employee("John", "Doe", 002));
        //employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee employee : employeeArray){
            System.out.println(employee);
        }

        //without equals method, this is comparing instances and will return false
        //when overriding equals, override hashcode as well
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 003)));

        //with equals method we can use indexOf() now
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 002)));

        //removing items
        employeeList.remove(2);
        System.out.println();
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
