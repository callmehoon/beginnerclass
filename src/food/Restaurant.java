package food;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<Menu> menus = new ArrayList<>();

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void displayMenu() {
        for (int idx=0; idx< menus.size(); idx++) {
            System.out.println("저희 음식점의 메뉴는 " + menus.get(idx).returnName() + "입니다.");
            System.out.println("가격은 " + menus.get(idx).returnPrice() + "원입니다.");
            System.out.println(menus.get(idx).returnName()+ " is " + menus.get(idx).returnDescription() + "합니다.");
            System.out.println();
        }
    }
}