import java.util.Scanner;

public class PizzaOrderVarArgs {
    static void orderPizza(String size, String... toppings) {
        System.out.println("Pizza Size: " + size);
        System.out.println("Toppings:");
        if (toppings.length == 0) {
            System.out.println("No toppings selected.");
        } else {
            for (String topping : toppings) {
                System.out.println("- " + topping);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Pizza Size (Small/Medium/Large): ");
        String size = scanner.nextLine();

        System.out.print("Enter toppings separated by commas (or press enter for none): ");
        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            orderPizza(size);
        } else {
            String[] toppings = input.split("\\s*,\\s*");
            orderPizza(size, toppings);
        }
    }
}
