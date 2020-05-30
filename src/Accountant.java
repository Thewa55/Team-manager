import java.util.Scanner;

class Accountant extends TeamCreator implements Salary{

    protected String degree;
    protected float salary;
    protected String fixedSalary;

    Accountant(){
        super("","","Accountant");
    }

    public void getSalary(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the Accountant's salary?");
        salary = keyboard.nextFloat();
        fixedSalary = String.format("%,.2f", salary);
    }

    public void addAccountant(){
        Scanner keyboard =new Scanner(System.in);
        super.addEmployee(this.role);
        System.out.println("What degree does the accountant have? (ie: Economics, Accounting, MBA)");
        degree = keyboard.nextLine();
        getSalary();
        System.out.println("The Accountant's name is "+ fullName+". Their email is: "+ email +". Their degree is "+ degree + ". Their salary is: $" + fixedSalary);
    }
}
