package oop2;

public class Main {

    public static void main(String[] args) {
        Transport[] transports = new Transport[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 8),
                new Truck("truck2", 6),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle1", 3)
        };
        ServiceStation station = new ServiceStation();
        for (Transport transport : transports) {
            station.check(transport);
        }
    }
}
