import java.util.Scanner;

public class karey {
    static Scanner sc = new Scanner(System.in);

    static void showHello() {
        String choice;

        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next();

        while ("h".equals(choice)){
            System.out.println("Hello");
            choice = sc.next();
        }
    }
    public static void main(String[]args) {
        karey obj = new karey();

        karey.showHello();
    }
}



