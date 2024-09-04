import java.util.StringJoiner;

public class string_operations_combined {
    public static void main(String[] args) {
        // Create strings using different methods
        String s1 = "Hello World";
        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);
        String s3 = new String("example");

        // Print the strings
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        // Print the length of s1 using length() method
        System.out.println("Length of s1: " + s1.length());

        // Print each character of s1 using a for loop and charAt()
        for (int i = 0; i < s1.length(); i++) {
            System.out.println("Character at index " + i + ": " + s1.charAt(i));
        }

        // Get a substring of s1 using the substring() method
        String substring = s1.substring(0, 5);
        System.out.println("Substring of s1 (first 5 characters): " + substring);

        // Convert s1 to uppercase and lowercase using toUpperCase() and toLowerCase()
        System.out.println("s1 in uppercase: " + s1.toUpperCase());
        System.out.println("s1 in lowercase: " + s1.toLowerCase());

        // Compare s1 and s3 using equals() and equalsIgnoreCase()
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equals 'hello world' (ignore case): " + s1.equalsIgnoreCase("hello world"));

        // Find the index of the first occurrence of 'o' in s1 using indexOf()
        System.out.println("Index of 'o' in s1: " + s1.indexOf('o'));

        // Perform multiple replace operations on s1 using replace()
        String replacedString = s1.replace('o', 'X').replace('l', 'Y');
        System.out.println("s1 after replacing 'o' with 'X' and 'l' with 'Y': " + replacedString);

        // Check if s1 starts with "Hello" and ends with "World" using startsWith() and endsWith()
        System.out.println("Does s1 start with 'Hello'? " + s1.startsWith("Hello"));
        System.out.println("Does s1 end with 'World'? " + s1.endsWith("World"));

        // Concatenate s1 with another string using concat() and StringBuilder
        String s4 = s1.concat(" - Welcome!");
        System.out.println("Concatenated string (using concat): " + s4);

        StringBuilder sb = new StringBuilder(s1);
        sb.append(" - Welcome!");
        System.out.println("Concatenated string (using StringBuilder): " + sb.toString());

        // Using String.format() to format strings
        System.out.println(String.format("Formatted s1: %s", s1));
        System.out.println(String.format("Formatted length of s1: %d", s1.length()));

        // Using StringJoiner to join strings
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(s1);
        joiner.add(s2);
        joiner.add(s3);
        System.out.println("Joined strings using StringJoiner: " + joiner.toString());

        // Split s1 into words using split() method
        String[] words = s1.split(" ");
        for (String word : words) {
            System.out.println("Word in s1: " + word);
        }
    }
}