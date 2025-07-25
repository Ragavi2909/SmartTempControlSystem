import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Target Temperature (°C): ");
        double target = scanner.nextDouble();

        TemperatureController controller = new TemperatureController(target);

        while (true) {
            System.out.print("Enter Current Temperature (or -999 to exit): ");
            double current = scanner.nextDouble();
            if (current == -999) break;
            controller.updateCurrentTemperature(current);
        }

        scanner.close();
    }
}
