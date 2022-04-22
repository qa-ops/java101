package java101;

public class Strings {

    public static void main(String[] args) {
        String text = "  Any text that you want  ";
        String whiteSpaceText = " ";

        System.out.println("Raw content: "+ text);
        System.out.println("String to lowercase: " + text.toLowerCase());
        System.out.println("String to uppercase: "+ text.toUpperCase());
        System.out.println("String length: " + text.length());
        System.out.println("Trim string: " + text.trim());
        System.out.println("Is empty: " + text.isBlank());
        System.out.println("Is empty: " + text.isEmpty());
        System.out.println("Is empty: " + whiteSpaceText.isBlank());
        System.out.println("Is empty: " + whiteSpaceText.isEmpty());
        System.out.println("Replace: " + text.replace("Any", "Whatever"));

        String[] split = text.split(" ");
        System.out.println("Length of array: " + split.length);
        System.out.println("Is split an array?: " + (split instanceof String[]));

    }


}
