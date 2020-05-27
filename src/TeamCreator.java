import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TeamCreator {
    protected String fullName;
    protected String email;
    protected String role;

    TeamCreator(String employeeName, String empEmail, String empRole){
        this.fullName = employeeName;
        this.email = empEmail;
        this.role = empRole;
    }

    public static void main(String [] args){
        ArrayList<Manager> manager = new ArrayList<Manager>();
        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
        ArrayList<Engineer> engineers = new ArrayList<Engineer>();
        ArrayList<Intern> interns = new ArrayList<Intern>();
        Scanner keyboard =new Scanner(System.in);
        Manager manager1 = new Manager();
        manager1.addManager();
        manager.add(manager1);
        System.out.println(manager.size());
        while (true){
            System.out.println("Who else would you like to add?");
            System.out.println("1) Engineer");
            System.out.println("2) Accountant");
            System.out.println("3) Intern");
            System.out.println("4) Done");
            if(keyboard.hasNextInt()) {
                int choice = keyboard.nextInt();
                if (choice == 1) {
                    Engineer engineer1 = new Engineer();
                    engineer1.addEngineer();
                    engineers.add(engineer1);
                } else if (choice == 2) {
                    Accountant accountant1 = new Accountant();
                    accountant1.addAccountant();
                    accountants.add(accountant1);
                } else if (choice == 3) {
                    Intern intern1 = new Intern();
                    intern1.addIntern();
                    interns.add(intern1);
                } else if (choice == 4) {
                    System.out.println("You've completed your team");
                    break;
                } else {
                    System.out.println("Please enter a number between 1-4");
                }
            } else{
                System.out.println("Please enter a number between 1-4.");
                keyboard.next();
            }
        }
    }
}
