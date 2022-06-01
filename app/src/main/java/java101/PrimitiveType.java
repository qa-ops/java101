package java101;

public class PrimitiveType {

    public static void main(String[] args) {
        String text = "Any text you want";
        char character = 'C';
        int number = 10;
        boolean result = true;
        float floatNumber = 0.02f;
        float floatNumber2 = 0.03f;
        float resultFloat = floatNumber2 - floatNumber;

        System.out.println("String: " + text);
        System.out.println("Integer: " + number);
        System.out.println("Boolean: " + result);
        System.out.println("Char: " + character);
        System.out.println("Float: " + floatNumber);
        System.out.println("Float2: " + floatNumber2);
        System.out.println("Result float: " + resultFloat);

        double doubleNumber = 0.02;
        double doubleNumber2 = 0.03;
        double resultDouble = doubleNumber2 - doubleNumber;

        System.out.println("Double: " + doubleNumber);
        System.out.println("Double2: " + doubleNumber2);
        System.out.println("Result Double: " + resultDouble);
    }

}
