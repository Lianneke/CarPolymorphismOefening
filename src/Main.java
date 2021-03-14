class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelarate (){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelarate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Holden extends Car{
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "-> startEngine";
    }

    @Override
    public String accelarate() {
        return getClass().getSimpleName() + "-> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake";
    }
}

class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelarate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelarate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi("Outlander", 6);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelarate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford("Falcon", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelarate());
        System.out.println(ford.brake());

        Holden holden = new Holden("Holden Commodore", 6);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelarate());
        System.out.println(holden.brake());
    }


}
