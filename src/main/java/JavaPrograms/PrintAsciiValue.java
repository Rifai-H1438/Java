package JavaPrograms;

public class PrintAsciiValue {

    // Method to print ASCII values of characters from A to Z
    public static void asciiValueOfAToZ() {
        for (int i = 65; i <= 90; i++) {
            System.out.println("The ASCII value of " + (char) i + " is " + i);
        }
    }

    // Method to print ASCII values of characters from a to z
    public static void asciiValueOfaToz() {
        for (int i = 97; i <= 122; i++) {
            System.out.println("The ASCII value of " + (char) i + " is " + i);
        }
    }

    // Method to print ASCII values of all characters (0 to 255)
    public static void asciiValueOfAllCharacters() {
        for (int i = 0; i <= 255; i++) {
            System.out.println("The ASCII value of " + (char) i + " is " + i);
        }
    }

    // Method to print the ASCII value of a specific character
    public static void printAsciiValue(char ch) {
        int asciiValue = (int) ch;
        System.out.println("The ASCII value of '" + ch + "' is " + asciiValue);
    }

    // Main method to test the functionalities
    public static void main(String[] args) {
        // Testing individual character ASCII values
        printAsciiValue('a');
        printAsciiValue('b');

        // Print ASCII values for A to Z
        asciiValueOfAToZ();

        // Print ASCII values for a to z
        asciiValueOfaToz();

        // Print all ASCII values (0 to 255)
        asciiValueOfAllCharacters();
    }
}
