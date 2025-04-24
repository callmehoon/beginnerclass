package food;

public class Restaurant {
    Food food;

    public void displayMenu() {
        System.out.println("저희 음식점의 메뉴는 " + food.getName() + "입니다.");
        System.out.println("가격은 " + food.getPrice() + "원입니다.");
    }

    public void addMenu(Food food) {
        this.food = food;
    }
}