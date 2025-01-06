import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods = {"Pizza", "Burger", "Pasta",};
        String[][] restaurants = {
            {"Domino's", "Pizza Hut"},
            {"McDonald's", "Burger King"},
            {"Olive Garden", "Pasta Palace"}
        };

        System.out.println("Welcome to the Food Delivery App!");
        System.out.println("Available foods:");
        for (int i = 0; i < foods.length; i++) {
            System.out.println((i + 1) + ". " + foods[i]);
        }

        System.out.print("Select a food item by entering the number: ");
        int foodChoice = scanner.nextInt() - 1;

        if (foodChoice >= 0 && foodChoice < foods.length) {
            System.out.println("Available restaurants for " + foods[foodChoice] + ":");
            for (int i = 0; i < restaurants[foodChoice].length; i++) {
                System.out.println((i + 1) + ". " + restaurants[foodChoice][i]);
            }

            System.out.print("Select a restaurant by entering the number: ");
            int restaurantChoice = scanner.nextInt() - 1;

            if (restaurantChoice >= 0 && restaurantChoice < restaurants[foodChoice].length) {
                System.out.println("You selected " + foods[foodChoice] + " from " + restaurants[foodChoice][restaurantChoice]);

                System.out.print("Do you have a discount code? (yes/no): ");
                String discountResponse = scanner.next();

                double price = 10.0; // Fixed price for demonstration purposes
                if (discountResponse.equalsIgnoreCase("yes")) {
                    price *= 0.9; // Apply 10% discount
                }

                System.out.println("Total Pay: $" + price);
            } else {
                System.out.println("Invalid restaurant selection.");
            }
        } else {
            System.out.println("Invalid food selection.");
        }
    }
}
