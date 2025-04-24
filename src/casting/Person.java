package casting;

public class Person {
    Car car;

    void buyCar(Car car) {
        this.car=car;
    }

    void pressBbang() {
        car.bbangbbang();
    }
}
