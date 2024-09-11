
/**
 * Write a description of class Intern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Intern extends Employee
{
    private double hourlyRate; 
    private int hoursWorked;
    
    public Intern(String name, int id, Position position, Division division, double hourlyRate, int hoursWorked) {
        super(name, id, position, division);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public double totalSalary() {
        int monthlyWorked = 20;
        int totalWorked = hoursWorked * monthlyWorked;
        double salary = hourlyRate * totalWorked;
        if (totalWorked > 80) {
            return (salary * 0.1) + salary;
        }else if (totalWorked < 80) {
            return salary;
        } else {
            return 0;
        }
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + getName());
        System.out.println("Posisi: " + position);
        System.out.println("Divisi: " + division);
        System.out.println("Hourly Rate : " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("totalSalary: " + totalSalary() + "\n");
    }
}
