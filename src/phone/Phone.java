package phone;

public class Phone {
    String modelName;

    Phone(String modelName) {
        this.modelName=modelName;
    }

    void turnOn() {
        System.out.println("@@@애플로고@@@");
    }

    void turnOff() {
        System.out.println("띠로리로");
    }
}
