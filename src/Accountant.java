import java.util.Scanner;

class Accountant extends TeamCreator{

    protected String degree;

    Accountant(){
        super("","","Accountant");
    }

    public void addAccountant(){
        Scanner keyboard =new Scanner(System.in);
        super.addEmployee(this.role);
        System.out.println("What degree does the accountant have? (ie: Economics, Accounting, MBA)");
        degree = keyboard.nextLine();
        System.out.println("The accountant's name is "+ fullName+". Their email is: "+ email +"| Degree: "+ degree );
    }
}
