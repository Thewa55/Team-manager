import java.util.Scanner;

class Intern extends TeamCreator{

    protected String school;

    Intern(){
        super("","","Intern");
    }

    public void addIntern(){
        Scanner keyboard =new Scanner(System.in);
        super.addEmployee(this.role);
        System.out.println("What school does the Intern attend?");
        school = keyboard.nextLine();
        System.out.println("The Intern's name is "+ fullName+". Their email is: "+ email +". Their school is: "+ school );
    }
}
