import java.util.Scanner;

public class NinetyNineBottlesOfBeer {
    private static void printLyrics(int numberOfBottles) {
        if (numberOfBottles == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
        }
        else {
            System.out.printf("%d bottles of beer on the wall\n", numberOfBottles);
            System.out.printf("%d bottles of beer\n", numberOfBottles);
            System.out.printf("ya' take one down, ya' pass it around,\n");
            printLyrics(numberOfBottles - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Give me the number of bottles: ");
        Scanner scanner = new Scanner(System.in);
        
        int numberOfBottles = scanner.nextInt();
        
        printLyrics(numberOfBottles);
        
        scanner.close();
    }
}
