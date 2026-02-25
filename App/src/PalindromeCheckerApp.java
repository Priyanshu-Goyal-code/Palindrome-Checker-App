public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // UC1 & UC2 Context: Setup
        System.out.println("Palindrome Checker: String Reverse Method");
        System.out.print("Enter a string to check: ");
        String original = scanner.nextLine();

        // UC3 logic: Reverse the string using a loop
        String reversed = "";

        // Loop through the string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation: Note that strings are immutable,
            // so this creates a new string object in each iteration.
            reversed += original.charAt(i);
        }

        // Compare original and reversed using .equals()
        // We use .equals() because '==' compares memory addresses, not content.
        boolean isPalindrome = original.equalsIgnoreCase(reversed);

        // Display results
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome!");
        } else {
            System.out.println("Result: Not a Palindrome.");
        }

        scanner.close();
    }
}