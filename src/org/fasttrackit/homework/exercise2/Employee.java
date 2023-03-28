package org.fasttrackit.homework.exercise2;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Person, Comparable {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String address;
    private LocalDate dateOfEmployment;
    private String position;

    private int priority;

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String firstName, String lastName, int priority) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee) o;
            if (getBirthDate() == null && e.getBirthDate() == null) {
                return -1;
            }
            return getBirthDate().compareTo(e.getBirthDate());
        }
        return 0;
    }


}
