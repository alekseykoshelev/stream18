package oop2;

public class Car extends MotorTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Поднимаем машину");
        updateTyres();
        checkEngine();
    }
}
