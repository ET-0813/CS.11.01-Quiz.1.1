import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please enter your age below.");
                age = scanner.nextInt();
                System.out.println("Please enter your first name below.");
                firstName = scanner.next();

                System.out.println("Please enter your favourite food below.");
                favouriteFood = scanner.next();

                System.out.println("Hello " + firstName + "\nYou are " + age + " years old\nyour favourite food is " + favouriteFood);




    }

}
