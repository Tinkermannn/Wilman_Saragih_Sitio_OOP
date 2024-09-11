
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person implements CalculateSalary
{
    protected Position position;
    protected Division division;
    
    public Employee(String name, int id, Position position, Division division) {
        super(name, id);
        this.position = position;
        this.division = division;
    }
    
    public void receiveTask(String task) {
        System.out.print("Task: " + task + "\n");
    }
    
    public double totalSalary() {
        return 0;
    }
}
