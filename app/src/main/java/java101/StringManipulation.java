package java101;

public class StringManipulation {

    public static void main(String[] args) {
        String text = " Any text that you want ";

        System.out.println("Raw content: " + text);
        System.out.println("String to lowercase: " + text.toLowerCase());
        System.out.println("String to uppercase: " + text.toUpperCase());
        System.out.println("String length: " + text.length());
        System.out.println("Trim string: " + text.trim());
        System.out.println("Trim string length: " + text.trim().length());
        System.out.println("Is text blank: " + text.isBlank());
        System.out.println("Is text empty: " + text.isEmpty());

        String whiteSpaceText = " ";
        System.out.println("Is whiteSpaceText blank: " + whiteSpaceText.isBlank());
        System.out.println("Is whiteSpaceText empty: " + whiteSpaceText.isEmpty());

        System.out.println("Replace: " + text.replace("Any", "Whatever"));
        System.out.println("Text starts with Any: " + text.startsWith("Any"));
        System.out.println("Text starts with Any: " + text.startsWith(" Any"));
        System.out.println("Text ends with want: " + text.endsWith("want"));
        System.out.println("Text ends with want: " + text.endsWith("want "));
        System.out.println("Substring: " + text.substring(0,text.length()/2));
        System.out.println("Does string contains: " + text.contains("text that y"));
    }
}
