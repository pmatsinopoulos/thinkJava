import java.util.Scanner;

/**
 * Converts a decimal to its binary representation.
 * 
 * @author panayotismatsinopoulos
 *
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.print("Give me an integer number: ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int integer = scanner.nextInt();
            System.out.printf("Binary: %s\n", Integer.toString(integer, 2));
        }
        scanner.close();
    }
}
