package individual.cy.learn.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mystic
 */
public class Employee {
    private final int id;
    private String name;
    private String dept;
    private int salary;
    private final List<Employee> subordinateList;

    public Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinateList = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinateList.add(employee);
    }

    public void remove(Employee employee) {
        subordinateList.remove(employee);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinateList() {
        return subordinateList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
