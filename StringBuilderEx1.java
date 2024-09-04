public class StringBuilderEx1 {
    public static void main(String[] argv) {
        // Create StringBuilder with initial string "Hello World"
        StringBuilder sb1 = new StringBuilder("Hello World");
        System.out.println(sb1);

        // Reverse the string and print
        StringBuilder reverseSb = sb1.reverse();
        System.out.println("Reverse String = " + reverseSb);

        // The original StringBuilder is modified after reverse
        System.out.println("Modified StringBuilder = " + sb1);

        // Create an empty StringBuilder with default capacity (16)
        StringBuilder sb2 = new StringBuilder();
        System.out.println("Capacity of StringBuilder = " + sb2.capacity());

        // Append strings to sb2
        sb2.append("Hello");
        sb2.append(" ");
        sb2.append("World!");
        System.out.println(sb2.toString());

        // Insert "beautiful" at index 6
        sb2.insert(6, "beautiful");
        System.out.println(sb2.toString());

        // Replace part of the string in sb3
        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.replace(1, 3, "Java"); // Replaces "el" with "Java"
        System.out.println("After Replace() String = " + sb3.toString());

        // Delete part of the string in sb4
        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.delete(1, 3); // Deletes "el" from "Hello"
        System.out.println(sb4);

        // Create another StringBuilder and check capacity
        StringBuilder sb5 = new StringBuilder();
        System.out.println("Initial capacity = " + sb5.capacity());

        // Append to sb5 and check how capacity changes
        sb5.append("Hello");
        System.out.println("Capacity after appending 'Hello' = " + sb5.capacity());

        // Append a longer string, observe the capacity change
        sb5.append("Java is my favorite language");
        System.out.println("Capacity after appending long string = " + sb5.capacity());

        // Ensure capacity is at least 10, check capacity (no change expected)
        sb5.ensureCapacity(10);
        System.out.println("Capacity after ensureCapacity(10) = " + sb5.capacity());

        // Ensure capacity is at least 50, check capacity (should increase)
        sb5.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50) = " + sb5.capacity());

        // More StringBuilder operations with sb6
        StringBuilder sb6 = new StringBuilder("Hello");

        // Get character at index 1
        System.out.println(sb6.charAt(1)); // Should print 'e'

        // Get the length of the string
        System.out.println(sb6.length()); // Should print 5

        // Get a substring from index 1 to 5 (exclusive)
        System.out.println(sb6.substring(1, 5)); // Should print "ello"

        // Get a substring from index 1 to the end
        System.out.println(sb6.substring(1)); // Should print "ello"
    }
}