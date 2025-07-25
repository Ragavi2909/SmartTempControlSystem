public class TemperatureController {
    private double targetTemperature;
    private double currentTemperature;
    private Heater heater;
    private Cooler cooler;
    private Logger logger;

    public TemperatureController(double targetTemperature) {
        this.targetTemperature = targetTemperature;
        this.heater = new Heater();
        this.cooler = new Cooler();
        this.logger = new Logger();
    }

    public void updateCurrentTemperature(double currentTemp) {
        this.currentTemperature = currentTemp;
        System.out.println("\nCurrent Temperature: " + currentTemperature + "°C");
        controlTemperature();
    }

    private void controlTemperature() {
        if (currentTemperature < targetTemperature - 0.5) {
            heater.turnOn();
            cooler.turnOff();
            logger.logEvent("Heater turned ON at " + currentTemperature + "°C");
        } else if (currentTemperature > targetTemperature + 0.5) {
            heater.turnOff();
            cooler.turnOn();
            logger.logEvent("Cooler turned ON at " + currentTemperature + "°C");
        } else {
            heater.turnOff();
            cooler.turnOff();
            logger.logEvent("Temperature within range. All devices OFF at " + currentTemperature + "°C");
        }
    }
}
