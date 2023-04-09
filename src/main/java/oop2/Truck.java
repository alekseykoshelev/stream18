package oop2;

public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        System.out.println("Отцепляем прицеп");
        updateTyres();
        checkEngine();
        checkTrailer();
    }
}