import java.util.Scanner;

class Engineer extends TeamCreator implements Salary{

    protected String github;
    protected float salary;
    private String fixedSalary;

    Engineer(){
        super("","","Engineer");
    }

    public void getSalary(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the Engineer's salary?");
        salary = keyboard.nextFloat();
        fixedSalary = String.format("Their salary is: $%,.2f", salary);
    }


    public void addEngineer(){
        Scanner keyboard =new Scanner(System.in);
        super.addEmployee(this.role);
        System.out.println("What is the engineer's Github user name?");
        github = keyboard.nextLine();
        getSalary();
        System.out.println("The Engineer's name is " + fullName + ". Their email is: " + email + ". Their Github is: " + github + ". " + fixedSalary);
    }
}
