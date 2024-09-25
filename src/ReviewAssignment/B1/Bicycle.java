package ReviewAssignment.B1;

//public class Bicycle extends Car {
//    @Override
//    public void print(){
//        System.out.println("Vehicle is bicycle!");
//    }
//}

public class Bicycle implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bicycle is running");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopped");
    }

    @Override
    public void print() {
        System.out.println("Vehicle is bicycle");
    }
}