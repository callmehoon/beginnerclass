package phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Person p=new Person("성훈쓰");
        Phone ip=new Phone("아이폰15프로맥스");
        p.buy(ip);
        p.jarang();
        p.turnOnPhone();
        p.turnOffPhone();
    }
}
