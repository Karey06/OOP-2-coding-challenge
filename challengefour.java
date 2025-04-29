import java.util.Scanner;

public class challengefour {

    static Scanner scanner = new Scanner(System.in);

    static void showDetails() {
        String name;
        String nationality;
        int age;

        System.out.print("Input name:");
        name = scanner.next();
        System.out.print("Input nationality:");
        nationality = scanner.next();
        System.out.print("Input age:");
        age = scanner.nextInt();
        System.out.println("Greetings" + name + "you are:" + nationality);
        System.out.println("You are:" +age);

    }
public static void main(String[]args) {
        challengefour showDetails = new challengefour();
        challengefour.showDetails();
}

}

