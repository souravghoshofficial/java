import java.util.*;

public class StringOperations {
    static Scanner scanner = new Scanner(System.in);
    static String input;

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        input = scanner.nextLine();
        int choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Count occurrences of 'a'");
            System.out.println("2. Count occurrences of \"and\"");
            System.out.println("3. Check if it starts with \"The\"");
            System.out.println("4. Convert to character array");
            System.out.println("5. Display tokens (split by space/@/.)");
            System.out.println("6. Find largest palindrome");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    countA(input);
                    break;
                case 2:
                    countAnd(input);
                    break;
                case 3:
                    startsWithThe(input);
                    break;
                case 4:
                    toCharArray(input);
                    break;
                case 5:
                    displayTokens(input);
                    break;
                case 6:
                    findLargestPalindrome(input);
                    break;
                case 7:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }

    static void countA(String str) {
        long count = str.chars().filter(ch -> ch == 'a' || ch == 'A').count();
        System.out.println("Number of times 'a' appears: " + count);
    }

    static void countAnd(String str) {
        int count = 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase("and")) {
                count++;
            }
        }
        System.out.println("Number of times \"and\" appears: " + count);
    }

    static void startsWithThe(String str) {
        System.out.println("Starts with \"The\": " + str.startsWith("The"));
    }

    static void toCharArray(String str) {
        char[] arr = str.toCharArray();
        System.out.println("Character array: " + Arrays.toString(arr));
    }

    static void displayTokens(String str) {
        String[] tokens = str.split("[ @.]");
        System.out.println("Tokens:");
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }

    static void findLargestPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String[] words = cleaned.split("\\s+");
        String largest = "";
        for (String word : words) {
            if (isPalindrome(word) && word.length() > largest.length()) {
                largest = word;
            }
        }
        System.out.println("Largest palindrome: " + largest);
    }

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
