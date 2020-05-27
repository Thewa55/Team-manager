import java.util.Scanner;

class Accountant extends TeamCreator{

    public String emptyForNow;

    Accountant(){
        super("","","Accountant");
    }

    public void addAccountant(){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("What's the name of the accountant?");
        fullName = keyboard.nextLine();
        System.out.println("What is the accountant's email?");
        email = keyboard.nextLine();
        System.out.println("What school does the intern attend?");
        emptyForNow = keyboard.nextLine();
        System.out.println("The accountant's name is "+ fullName+". Their email is: "+ email +". Something: "+ emptyForNow );
    }
}
