/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package class21lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author dbarter1
 */
public class LabActivity5 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("Barter", "Dylan", "123-45-6789");
        Employee emp2 = new Employee("Johnson", "Phil", "123-45-6789");
        Employee emp3 = new Employee("Ferguson", "Albert", "111-22-3333");
        Employee emp4 = new Employee("Fallon", "James", "888-00-9999");
        
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        
        Map<String,Employee> employeeMap = new HashMap<>();
        
        //I will use the employee SSN as the key for the map because it should be unique to every employee even though in this 
        //example we are giving two employees the same SSN.  A map's key needs to be unique
        employeeMap.put("123-45-6789", emp1);
        employeeMap.put("123-45-6789", emp2);
        employeeMap.put("111-22-3333", emp3);
        employeeMap.put("888-00-9999", emp4);
        
        //I will retrieve individual items by calling them by their SSN, which i used for the key as demonstrated below
        Employee choiceEmployee = employeeMap.get("111-22-3333");
        System.out.println(choiceEmployee);
        
        //When you store a new object at a key used by a previous object, the previous object is overwritten.  For example I will overwrite
        //the Employee object with the key "111-22-3333" with the employee with the social sec number "888-00-9999"
        employeeMap.put("111-22-3333", emp4);
        System.out.println("Showing that the last employee's has been overwritten with a different employee: ");
        System.out.println((Employee)employeeMap.get("111-22-3333"));
        
        System.out.println("Demonstrating a loop that displays the entries from the key set:");
        //Make a set from the map's keyset
        Set<String> empMapKeySet = employeeMap.keySet();
        //Loop through the map with the keys from the set
        
        for(String ssn : empMapKeySet) {
            System.out.println("Key: " + ssn + "  " + employeeMap.get(ssn));
        }
        System.out.println("Demonstrating a loop that displays all the values:");
        //Create a collection to store all the map's values:
        Collection<Employee> empMapValueCollection = employeeMap.values();
        //Loop through the collection to display the values:
        for(Employee emp : empMapValueCollection){
            System.out.println(emp);
        }
        
        
                
    }
}
