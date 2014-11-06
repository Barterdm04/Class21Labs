/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class21lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author dbarter1
 */
public class LabActivity4 {
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
        //Print the size of the arraylist
        System.out.println("The size of the employee list is: " + employeeList.size());
        //Show the employee in index 1
        Employee choiceEmployee = employeeList.get(1);
        System.out.println("This is the employee in the index chosen:");
        System.out.println(choiceEmployee.toString());
        
        //Converting arraylist to a hashset
        Set<Employee> employeeSet = new HashSet<>(employeeList);
        //Bring the updated employee list with no duplicates back to an arraylist from the set
        employeeList = new ArrayList<>(employeeSet);
        
        System.out.println("All employees:");
        for(Employee emp : employeeList){
            System.out.println(emp);
        }
        System.out.println("The updated size of the employee list is: " + employeeList.size());
        employeeList.remove(2);      
        System.out.println("Removed index 2:");
  
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
