import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class TeamCreator{
    protected String role;
    protected String fullName;
    protected String email;
    static int teamCount = 0;
    private static Date today = new Date();

    TeamCreator(String employeeName, String empEmail, String empRole){
        this.fullName = employeeName;
        this.email = empEmail;
        this.role = empRole;
    }

    void addEmployee(String empRole) {
        teamCount++;
        Scanner keyboard =new Scanner(System.in);
        System.out.println("What's the name of the " + empRole +"?");
        fullName = keyboard.nextLine();
        System.out.println("What is the " + empRole +  "'s email?");
        email = keyboard.nextLine();
    }

    public static void main(String [] args){
        ArrayList<Manager> manager = new ArrayList<Manager>();
        ArrayList<Accountant> accountants = new ArrayList<Accountant>();
        ArrayList<Engineer> engineers = new ArrayList<Engineer>();
        ArrayList<Intern> interns = new ArrayList<Intern>();
        System.out.println(" /$$$$$$$$                                      /$$$$$$$            /$$ /$$       /$$                          \n" +
                "|__  $$__/                                     | $$__  $$          |__/| $$      | $$                          \n" +
                "   | $$  /$$$$$$   /$$$$$$  /$$$$$$/$$$$       | $$  \\ $$ /$$   /$$ /$$| $$  /$$$$$$$  /$$$$$$   /$$$$$$       \n" +
                "   | $$ /$$__  $$ |____  $$| $$_  $$_  $$      | $$$$$$$ | $$  | $$| $$| $$ /$$__  $$ /$$__  $$ /$$__  $$      \n" +
                "   | $$| $$$$$$$$  /$$$$$$$| $$ \\ $$ \\ $$      | $$__  $$| $$  | $$| $$| $$| $$  | $$| $$$$$$$$| $$  \\__/      \n" +
                "   | $$| $$_____/ /$$__  $$| $$ | $$ | $$      | $$  \\ $$| $$  | $$| $$| $$| $$  | $$| $$_____/| $$            \n" +
                "   | $$|  $$$$$$$|  $$$$$$$| $$ | $$ | $$      | $$$$$$$/|  $$$$$$/| $$| $$|  $$$$$$$|  $$$$$$$| $$            \n" +
                "   |__/ \\_______/ \\_______/|__/ |__/ |__/      |_______/  \\______/ |__/|__/ \\_______/ \\_______/|__/            \n" +
                "                                                                                                               \n" +
                "                                                                                                              ");
        String todayFormat = String.format("%tA, %<tB %<td", today);
        Scanner keyboard =new Scanner(System.in);
        Manager manager1 = new Manager();
        manager1.addManager();
        manager.add(manager1);
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
                    System.out.println("You've completed your team!");
                    System.out.println("Manager");
                    System.out.println("Name: " + manager.get(0).fullName + " | E-mail: " + manager.get(0).email + " | Office Number" + manager.get(0).officeNumber);
                    System.out.println("Engineers");
                    for( Engineer engineer : engineers){
                        System.out.println("Name: " + engineer.fullName + " | E-mail: " + engineer.email + " | GitHub: " + engineer.github + "| Salary: "+engineer.salary);
                    }
                    System.out.println("Accountants");
                    for(Accountant accountant: accountants){
                        System.out.println("Name: " + accountant.fullName + " | E-mail: " + accountant.email + " | Degree: " + accountant.degree + "| Salary: "+ accountant.salary);
                    }
                    System.out.println("Interns");
                    for( Intern intern : interns){
                        System.out.println("Name: " + intern.fullName + " | E-mail: " + intern.email + " | School: " + intern.school);
                    }
                    System.out.println("You have "+ teamCount +" members on the team. Created on " + todayFormat);
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
