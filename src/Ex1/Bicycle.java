package Ex1;

public class Bicycle implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bicycle is running");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopped");
    }

    @Override
    public void printType() {
        System.out.println("This is a bicycle");
    }

    @Override
    public void fly() {
        System.out.println("Bicycle cannot fly");
    }
}
