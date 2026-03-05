package composition;
class Engine{
    void start(){
        System.out.println("engine start");
    }
}
public class Car {
    private Engine engine;
    Car(){
        engine=new Engine();

    }
    void drive(){
        engine.start();
        System.out.println("car is moving");
    }

   public static void main(String[] args) {
        Car c =new Car();
        c.drive();

    }
}
