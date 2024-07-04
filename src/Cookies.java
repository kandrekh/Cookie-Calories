import java.util.Scanner;

public class Cookies {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        getCookies();
    }

    public static void getCookies() {

        System.out.print("How many cookies have you already eaten? ");
        int cookies = input.nextInt();

        if (validateCookies(cookies)) {
            displayCalories(cookies);
        } else {
            while (!validateCookies(cookies)) {
                if (!validateCookies(cookies)) {
                    getCookies();
                    break;
                }
            }
        }
    }

    public static boolean validateCookies(int cookiesEaten) {
        boolean valid;
        valid = cookiesEaten != 0;
        return valid;
    }

    public static void displayCalories(int cookies) {
        Calories calories = new Calories(cookies);
        System.out.println("Cookies eaten: " + calories.getCalories());
        System.out.println("Total calories in box of cookies: " + calories.calculateCaloriesInBox());
        System.out.println("Calories based on cookies eaten: " + calories.calculateSingleServingCalories() * calories.getCalories());
        System.out.println("Cookies remaining: " + calories.cookiesRemaining());
    }
}