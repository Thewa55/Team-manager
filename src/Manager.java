import java.util.Scanner;

class Manager extends TeamCreator{
    public int officeNumber;

    Manager(){
        super("", "", "Manager");
    }

    public void addManager(){
        Scanner keyboard =new Scanner(System.in);
        super.addEmployee(this.role);
        System.out.println("What is the manager's office number?");
        officeNumber = keyboard.nextInt();
        System.out.println("The manager's name is " + fullName + ". Their email is: " + email + ". Their office number is: " + officeNumber);
    }
}
