import java.util.*;

public class MentoringTODO2 {
    public static void main(String[] args) {
        /*
        - 초간단 자동차 경주 게임을 구현한다.
        - 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
        - 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
        - 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

        *힌트*
        - 랜덤 값은 자바 java.util.Random 클래스의 nextInt(10) 메소드를 활용한다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int number = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int number2 = scanner.nextInt();
        System.out.printf("%n실행 결과%n");
        String value = scanner.nextLine();

    }
}

class RaceCar {
    char car='-';

}
