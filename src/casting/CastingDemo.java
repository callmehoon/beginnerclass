package casting;

public class CastingDemo {
    public static void main(String[] args) {
        Car car=new Car();
        Car ferrari=new Ferrari();
        Car casper=new Casper();

        Person person=new Person();
        person.buyCar(casper);
        person.pressBbang();
        person.buyCar(ferrari);
        person.pressBbang();
    }
}