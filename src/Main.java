import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Set your new Scanner(System.in) to scan the inputs you are going to write into your program.
        Scanner scan= new Scanner(System.in);

        //Create all your variables at the beginning of the program.
        String firstName, lastName, month;
        int day, year;


        System.out.println("What is your first name?");
        firstName= scan.nextLine();
        System.out.println("What is your last name?");
        lastName= scan.nextLine();
        System.out.printf("Welcome to you %s %s, happy to meet you!%n", firstName,lastName);
        

        //Use "System.out.printLn();" to skip a line between 2 paragraphs.
        System.out.println();

        System.out.println("What day are you born?");
        day= scan.nextInt();

        //This scan.nextLine(); will allow you to solve the nextLine-after-nextInt skipping bug.
        scan.nextLine();

        System.out.println("What month are you born?");
        month= scan.nextLine();
        System.out.println("What year are you born?");
        year=scan.nextInt();

        //Here is the java template for Strings, System.out.printLn(String.format("bla bla %s.",variable));
        //In your string, the "%s" means a variable is used, and it's important that you respect the order
        //of the variables you put at the end of the template. Below my variables are "month, day, year"
        //which means that my first "%s" will have "month" as a value, my second will have "day" as a value
        //and my third will have "year" as a value.
        System.out.printf("You are born on %s %s, %s.%n",month, day, year);

        //To create the variable "age" you have to put it before you're printing. Also, the "year" variable
        //must have been called before, otherwise it cannot use the variable to calculate the age, that's why
        //it doesn't work if you put "int age= (2022-year)" in the variables at the top of the code.
        int age= (2022-year);
        System.out.printf("You are %s years old.%n",age);




    }
}