//Factory Design Pattern

public class TestClass {

    public static void main(String[] args) {
        Car car = CarFactory.getCar("to work");
        car.drive();

        car = CarFactory.getCar("to travel");
        car.drive();
      
    }
}

class CarFactory{
    public static Car getCar(String reason){
        switch (reason){
            case "to work": return new Audi(45);
            case "to travel": return new Tesla(100);

            default: throw new IllegalArgumentException("Invalid Reason "+reason);
        }
    }
}

abstract class Car{
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public abstract void drive();
}

class Audi extends Car{

    @Override
    public void drive() {
        System.out.println("Audi Speed : "+getSpeed());
    }

    public Audi(int speed){
        super(speed);
    }
}

class Tesla extends Car{

    @Override
    public void drive() {
        System.out.println("Tesla Speed : "+getSpeed());
    }

    public Tesla(int speed){
        super(speed);
    }
}
