public class PizzaOrderCmdArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide pizza size followed by toppings.");
            return;
        }

        String size = args[0];
        System.out.println("Pizza Size: " + size);

        if (args.length == 1) {
            System.out.println("No toppings selected.");
        } else {
            System.out.println("Toppings:");
            for (int i = 1; i < args.length; i++) {
                System.out.println("- " + args[i]);
            }
        }
    }
}
