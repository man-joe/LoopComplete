/*
The following program should allow the users to input 10 integers and output the total. Please finish it.
 */
import java.util.Scanner;

public class GetIntegers {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        // Loop should start here
        for(int counter = 0; counter < 10; counter++) {
            num = keyboard.nextInt();
            total += num;
        }
        // Loop should end here

        System.out.println("The total of all 10 numbers is " + total);

    }

}
