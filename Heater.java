public class Heater extends Device {
    @Override
    public void turnOn() {
        System.out.println("Heater is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Heater is OFF");
    }
}
