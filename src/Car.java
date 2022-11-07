public class Car {
    private final String name;
    private final String engine;
    public static int numberOfCars;

    public Car (String n, String e) {
        name = n;
        engine = e;
        numberOfCars++;
    }

    void display () {
        System.out.println(name + " " + engine);
    }

    public static void main(String[] args) {
        Car car1 = new Car ("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        car1.display();

        Car car2 = new Car ("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
        car2.display();
    }
}
