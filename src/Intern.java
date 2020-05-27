import java.util.Scanner;

class Intern extends TeamCreator{
    String school;

    Intern(){
        super("","","Intern");
    }

    public void addIntern(){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("What's the name of the intern?");
        fullName = keyboard.nextLine();
        System.out.println("What is the intern's email?");
        email = keyboard.nextLine();
        System.out.println("What school does the intern attend?");
        school = keyboard.nextLine();
        System.out.println("The intern's name is "+ fullName+". Their email is: "+ email +". Their school is: "+ school );
    }
}
