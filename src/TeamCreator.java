import java.util.ArrayList;
import java.util.Scanner;

public class TeamCreator {
    private String fullName;
    private String email;
//
//    Employee(String employeeName, String empEmail){
//        this.fullName = employeeName;
//        this.email = empEmail;
//    }

    public static void main(String [] args){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> emails = new ArrayList<String>();
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Welcome to your team managing program");
        System.out.println("What's the name of the team manager?");
        String managerName = keyboard.nextLine();
        System.out.println("What is the manager's email?");
        String managerEmail = keyboard.nextLine();
        while (true){
            System.out.println("Who else would you like to add?");
            System.out.println("1) Engineer");
            System.out.println("2) Accountant");
            System.out.println("3) Intern");
            System.out.println("4) Done");
            int choice = keyboard.nextInt();
        }
    }
}
