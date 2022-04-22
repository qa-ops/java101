package java101;

public class Switch {

    public static void main(String[] args) {
        int option =  30;
        switch (option) {
            case 1:
                System.out.println("Do code for option 1");
                break;
            case 2:
                System.out.println("Do code for option 2");
                break;
            case 3:
            case 4:
                System.out.println("Do code for option 3 and 4");
                break;
            default:
                System.out.println("Do the default option");
        }

    }
}
