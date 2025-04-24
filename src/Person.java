public class Person {
    private String name;
    private int tall;
    private String phoneNumber;

    Person() {

    }

    Person(String name, int tall, String phoneNumber) {
        this.name=name;
        this.tall=tall;
        this.phoneNumber=phoneNumber;
    }

    Person(String name, String phoneNumber) {
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public void walk() {
        System.out.println("뚜벅뚜벅");
    }
    public void eat(String s) {
        System.out.println(s+" 냠냠");
    }
}
