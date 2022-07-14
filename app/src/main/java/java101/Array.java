package java101;

public class Array {

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60};

        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        try {
            System.out.println(numbers[6]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("exception");
        }
        System.out.println(numbers[5]);
        numbers[5] = 8;
        System.out.println(numbers[5]);
    }
}
