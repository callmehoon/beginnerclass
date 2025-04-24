public class MethodDemo {
    public static void main(String[] args) {
        multiValid(100,2);
    }

    public static void multiValid(int x, int y) {
        if (x*y>=100) {
            System.out.println("100보다 크거나 같습니다.");
        } else if (x*y<100) {
            System.out.println("100보다 작습니다.");
        }
    }
}
