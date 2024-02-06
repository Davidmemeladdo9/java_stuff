import java.util.regex.*;

public class CompileMethodExample {
    public static void main(String[] args) {
        // Compile a regular expression pattern
        Pattern pattern = Pattern.compile("\\b\\d+\\b");

        // Output the compiled pattern (toString method is implicitly called)
        System.out.println("Compiled Pattern: " + pattern);

        // Create a matcher for the input string
        Matcher matcher = pattern.matcher("123 apples, 456 oranges");

        // Find all occurrences of numbers in the string
        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }
    }
}
