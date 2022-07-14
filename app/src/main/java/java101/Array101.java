package java101;

public class Array101 {

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60};

        System.out.println("Size array: " + numbers.length);
        System.out.println("Array[0]: " + numbers[0]);
        try {
            System.out.println("Array[6]: " + numbers[6]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array[6] index out of bound exception");
        }
        System.out.println("Array[5]: " + numbers[5]);
        numbers[5] = 8;
        System.out.println("Array[5]: " + numbers[5]);
    }
}
