//Methods and classes do not have semicolons.
import java.util.Scanner;
public class Helloworld {
    public static void main(String args[]) {
        System.out.println("Hello world!");
        addressInfo();
        majorInfo();
        madLibs();

    }
//    Empty parenthesis means method does not receive any parameters
    public static void addressInfo(){
        System.out.println("\nMy name is Tuntufye Mwakalasya");
        System.out.println("My address is University towers 911D");
        System.out.println("Miami,Fl 33174");

    }

    public static void majorInfo(){
        System.out.println("\nI am a computer science major");
        System.out.println("This is my first programming class");
        System.out.println("I like Java");

    }


    public static void madLibs(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nWhat is your favorite food ");
        String favFood;
        String favRestaurant;
        String favDrink;
        String favDessert;
        favFood = keyboard.nextLine();

        System.out.print("\nWhat is your favorite restaurant to eat " + favFood + "?");
        favRestaurant = keyboard.nextLine();
        System.out.print("\nWhat is your favorite drink ");
        favDrink = keyboard.nextLine();
        System.out.print("\nWhat is your favorite dessert ");
        favDessert = keyboard.nextLine();

        System.out.println("For your birthday I will take you to eat "
                + favFood + " and to drink "
                + favDrink + " and have " + favDessert +  " at " + favRestaurant);

    }




}