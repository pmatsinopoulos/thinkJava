import java.util.Scanner;

public class CheckFermat {
    private static boolean checkFermat(int a, int b, int c, int n) {
        return Math.pow(a, n) + Math.pow(b,  n) == Math.pow(c,  n);
    }
    
    public static void main(String[] args) {
        System.out.print("Give me a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        System.out.print("Give me b: ");
        int b = scanner.nextInt();
        
        System.out.print("Give me c: ");
        int c = scanner.nextInt();
        
        System.out.print("Give me n: ");
        int n = scanner.nextInt();
        
        System.out.printf("a: %d, b: %d, c: %d, n: %d\n", a, b, c, n);
        boolean result = checkFermat(a, b, c, n);
        
        if (result && n > 2) {
            System.out.println("Holly smokes! Fermat was wrong");
        }
        else {
            System.out.println("Bye");
        }
        scanner.close();
    }
}
