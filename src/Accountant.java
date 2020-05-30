import java.util.Scanner;

class Accountant extends TeamCreator{

    public String degree;

    Accountant(){
        super("","","Accountant");
    }

    public void addAccountant(){
        Scanner keyboard =new Scanner(System.in);
        super.addEmployee(this.role);
        System.out.println("What school does the intern attend?");
        degree = keyboard.nextLine();
        System.out.println("The accountant's name is "+ fullName+". Their email is: "+ email +". Finance degree (ie: Economics, Accounting, MBA): "+ degree );
    }
}
