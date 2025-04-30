package food;

public class RestaurantDemo {
    public static void main(String[] args) {
        Restaurant songaheaven = new Restaurant();
        Food donkatsu = new Food("돈까스", 12000, "바삭바삭");
        Food jjolmyeon = new Food("쫄면", 8000, "쫄깃쫄깃");
        Drink originalcoke = new Drink("코카콜라", 2500, "시원");

        songaheaven.addMenu(donkatsu);
        songaheaven.addMenu(jjolmyeon);
        songaheaven.addMenu(originalcoke);
        songaheaven.displayMenu();
    }
}
