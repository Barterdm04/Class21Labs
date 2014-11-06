/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class21lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbarter1
 */
public class LabActivity3 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Barter", "Dylan", "123-45-678");
        Employee emp2 = new Employee("Johnson", "Phil", "123-45-678");
        Employee emp3 = new Employee("Ferguson", "Albert", "111-22-333");
        Employee emp4 = new Employee("Fallon", "James", "888-00-999");
        
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        
        System.out.println("The size of the employee list is: " + employeeList.size());
        
        Employee choiceEmployee = (Employee)employeeList.get(1);
        System.out.println("This is the employee in the index chosen:");
        System.out.println(choiceEmployee.toString());
        
        System.out.println("All employees:");
        for(Employee emp : employeeList){
            System.out.println(emp);
        }
        
        employeeList.remove(3);      
        System.out.println("Removed index 3:");
  
        for(Employee emp : employeeList){
            System.out.println(emp);
        }
        
        employeeList.clear();
        System.out.println("Removed all:");
        
        for(Employee emp : employeeList){
            System.out.println(emp);
        }
    }
}       
