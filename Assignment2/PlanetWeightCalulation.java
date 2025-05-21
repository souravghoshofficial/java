import java.util.Scanner;

class Planet {
    String name;
    double mass;
    double radius;
    static final double G = 6.67430e-11;

    Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    double weightOnPlanet(double earthMass) {
        return earthMass * surfaceGravity();
    }
}

public class PlanetWeightCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Planet[] planets = {
            new Planet("MERCURY", 3.303e23, 2.4397e6),
            new Planet("VENUS", 4.869e24, 6.0518e6),
            new Planet("EARTH", 5.976e24, 6.37814e6),
            new Planet("MARS", 6.421e23, 3.3972e6),
            new Planet("JUPITER", 1.9e27, 7.1492e7),
            new Planet("SATURN", 5.688e26, 6.0268e7),
            new Planet("URANUS", 8.686e25, 2.5559e7),
            new Planet("NEPTUNE", 1.024e26, 2.4746e7)
        };

        System.out.print("Enter your mass on Earth (in kg): ");
        double earthMass = scanner.nextDouble();

        System.out.println("Choose a planet to calculate your weight:");
        for (int i = 0; i < planets.length; i++) {
            System.out.println((i + 1) + ". " + planets[i].name);
        }

        int choice = scanner.nextInt();

        if (choice < 1 || choice > planets.length) {
            System.out.println("Invalid choice.");
            return;
        }

        Planet selected = planets[choice - 1];
        double weight = selected.weightOnPlanet(earthMass);

        System.out.printf("Your weight on %s would be: %.2f N\n", selected.name, weight);
    }
}
