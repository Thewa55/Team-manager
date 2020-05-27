import java.util.Scanner;

class Engineer extends TeamCreator{

    public String github;

    Engineer(){
        super("","","Engineer");
    }

    public void addEngineer(){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("What's the name of the engineer?");
        fullName = keyboard.nextLine();
        System.out.println("What is the engineer's email?");
        email = keyboard.nextLine();
        System.out.println("What is the engineer's Github user name?");
        github = keyboard.nextLine();
        System.out.println("The engineer's name is "+ fullName+". Their email is: "+ email +". Their github is: "+ github);
    }
}
