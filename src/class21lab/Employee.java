package class21lab;

import java.util.*;

public class Employee {
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.ssn != null ? this.ssn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if ((this.ssn == null) ? (other.ssn != null) : !this.ssn.equals(other.ssn)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Employee {" + "Last Name = " + lastName + ", First Name = " + firstName + ", SSN = " + ssn + '}';
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    

    
}
