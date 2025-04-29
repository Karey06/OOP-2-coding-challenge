import java.util.Scanner;

public class challengethree {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input age:");
        int age = scanner.nextInt();

        if (age < 3){
            System.out.println("A kindergaten student");
        } else if (age < 14) {
            System.out.println("A primary school student");

        } else if (age < 18) {
            System.out.println("A highschool student");

        }
    scanner.close();
    }
}
