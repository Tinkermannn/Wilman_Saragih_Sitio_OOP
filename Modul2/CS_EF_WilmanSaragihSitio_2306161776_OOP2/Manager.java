import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Manager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manager extends Person
{
    private List<Employee> employees;
    
    public Manager(String name, int id) {
        super(name, id);
        employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    public void assignTask(Employee employee, String task) {
        employee.receiveTask(task);
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + getName());
        System.out.println("ID: " + getId());
        for (Employee employee : employees) {
            System.out.println("- " + employee.getName());
        }
    }
}
