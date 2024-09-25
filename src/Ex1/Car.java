package Ex1;

public class Car implements Vehicle{
    private boolean hasPetroleum;

    @Override
    public void run() {
        if (hasPetroleum) {
            System.out.println("Car is running");
        }
        else {
            try {
                throw new Exception("Cannot run without petroleum");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void printType() {
        System.out.println("This is a car");
    }

    @Override
    public void fly() {
        System.out.println("Car cannot fly");
    }
}
