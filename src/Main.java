
import java.util.Scanner;

public class Main {
    public int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public String greeting(String name) {
        return "Bonjour " + name;
    }

    public int add(int numOne, int numTwo, int numThree, int numFour) {
        int sumOne = add(numOne, numTwo);
        int sumTwo = add(sumOne, numThree);
        return add(sumTwo, numFour);
    }

    public void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }


    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int numOne = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int numTwo = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int numThree = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        int numFour = scanner.nextInt();

        int resultThree = mainObj.add(numOne, numTwo, numThree, numFour);
        System.out.println("Sum of four numbers: " + resultThree);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        scanner.nextLine();

        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        mainObj.printMe(message);

        System.out.print("Bonjour: "+ name);
        String greeting = scanner.nextLine();
        mainObj.printMe(name);
    }
}