import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("What is you name? ");
        Scanner print = new Scanner(System.in);

        String name = print.nextLine();
        System.out.println("What is your age? ");
        int age = print.nextInt();
        print.nextLine();

        System.out.println("What is your favorite food?");
        String food = print.nextLine();

        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your fav food is "+food);



    }
}