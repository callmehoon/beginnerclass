package phone;

public class Person {
    String name;
    Phone ip;

    Person(String name) {
        this.name=name;
    }

    void buy(Phone ip) {
        this.ip=ip;
        System.out.println(name+"가 "+ip.modelName+"를 샀습니다.");
    }

    void jarang() {
        System.out.println(name+"가 "+ip.modelName+"를 자랑합니다.");
    }

    void turnOnPhone() {
        System.out.println(name+"가 "+ip.modelName+"를 켰습니다.");
        ip.turnOn();
    }

    void turnOffPhone() {
        System.out.println(name+"가 폰을 껐습니다.");
        ip.turnOff();
    }
}
