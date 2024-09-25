package ReviewAssignment.B1;

public class Car implements Vehicle{

//    public void run(){
//        System.out.println("Vehicle is running");
//    }
//
//    public void stop(){
//        System.out.println("Vehicle is stopped");
//    }
//
//    public void print(){
//        System.out.println("Vehicle is car!");
//    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

    @Override
    public void print() {
        System.out.println("Vehicle is a car");
    }
}
