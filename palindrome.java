import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanStr).reverse().toString();
        
        if (cleanStr.equals(reversed)) {
            System.out.println("✅ \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("❌ \"" + str + "\" is not a palindrome.");
        }
        
        sc.close();
    }
}
