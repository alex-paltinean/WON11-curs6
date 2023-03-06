import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is an experiment");
        System.out.println("Hello world!!!!!");
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();

        lamp1.turnOn();
        lamp2.turnOn();

        Lamp customLamp = new Lamp("green", 10);
        customLamp.turnOn();
        customLamp.increaseIntensity();
        customLamp.turnOff();
        customLamp.turnOn();

        Random random = new Random();
        random.nextInt();

    }
}
