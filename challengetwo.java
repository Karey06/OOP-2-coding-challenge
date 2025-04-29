public class challengetwo {
    void showInterest(){
        double amount;
        double interest;

        amount = 10000;
        System.out.println("First amount:" + amount);

        interest = 25.0;
        amount = amount* (100 + interest)/100;
        System.out.println("After one year:" + amount);

        amount = amount* (100 + interest)/100;
        System.out.println("After two years" + amount);

    }
public static void main(String[]args) {
        challengetwo showInterest = new challengetwo();
    challengetwo variable = new challengetwo();
    variable.showInterest();

}
}

