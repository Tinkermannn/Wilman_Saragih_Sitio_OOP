
/**
 * Write a description of class Main here.
 *
 * @author (Wilman Saragih Sitio)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        FullTimeEmployee Harvan = new FullTimeEmployee("Harvan", 2294, Position.DIRECTOR, Division.Seminar, 1000, 700, 0.6);
        FullTimeEmployee Rafi = new FullTimeEmployee("Rafi", 2938, Position.STAFF, Division.Marketing, 500.0, 100, 0.9);
        
        Intern Karina = new Intern("Karina", 4319, Position.INTERN, Division.Education, 2, 7);
        Intern Bernadya = new Intern("Bernadya", 3291, Position.INTERN, Division.CreativeMedia, 3, 6);
        
        Manager Hasan = new Manager("Hasan",1001);
        Hasan.addEmployee(Harvan);
        

        Hasan.addEmployee(Rafi);
        
        Harvan.displayInfo();
        Harvan.receiveTask("Search speaker for grand event");
        
        Rafi.displayInfo();
        Rafi.receiveTask("Search speaker for grand event");

        Karina.displayInfo();
        Bernadya.displayInfo();
        Hasan.displayInfo();
        

    }

    
}
