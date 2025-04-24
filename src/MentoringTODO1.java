import java.util.*;

public class MentoringTODO1 {
    public static void main(String[] args) {
        System.out.printf("첫번째 숫자를 입력해주세요.>");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();

        System.out.printf("첫번째 사칙연산기호(+,-,*,/)을 입력해주세요.>");
            Scanner sc1=new Scanner(System.in);
            String op = sc1.nextLine();
            char finalop = op.charAt(0);
            while (finalop!='+'&&finalop!='-'&&finalop!='*'&&finalop!='/') {
                System.out.printf("연산기호를 잘못 입력하였습니다. 다시 입력해주세요. 첫번째 사칙연산기호(+,-,*,/)>");
                sc1 = new Scanner(System.in);
                op = sc1.nextLine();
                finalop = op.charAt(0);
            }

        System.out.printf("두번째 숫자를 입력해주세요.>");
        Scanner sc2=new Scanner(System.in);
        int b = sc2.nextInt();

        System.out.printf("두번째 사칙연산기호(+,-,*,/,=)을 입력해주세요.>");
        Scanner sc3=new Scanner(System.in);
        String op1 = sc3.nextLine();
        char finalop2 = op1.charAt(0);
        while (finalop2!='+'&&finalop2!='-'&&finalop2!='*'&&finalop2!='/'&&finalop2!='=') {
            System.out.printf("연산기호를 잘못 입력하였습니다. 다시 입력해주세요. 두번째 사칙연산기호(+,-,*,/)>");
            sc3 = new Scanner(System.in);
            op1 = sc3.nextLine();
            finalop2 = op1.charAt(0);
        }
        if (finalop2=='='&&finalop=='+') {
            System.out.println("결과: "+ (int)(a + b));
            return;
        }
        if (finalop2=='='&&finalop=='-') {
            System.out.println("결과: "+ (int)(a - b));
            return;
        }
        if (finalop2=='='&&finalop=='*') {
            System.out.println("결과: "+ (int)(a * b));
            return;
        }
        if (finalop2=='='&&finalop=='/'&&b!=0) {
            System.out.println("결과: "+ (int)(a / b));
            return;
        }
        if (finalop2!='=') {
            System.out.printf("세번째 숫자를 입력해주세요.>");
        }

        Scanner sc4=new Scanner(System.in);
        int c = sc4.nextInt();

        System.out.printf("세번째 사칙연산기호(+,-,*,/,=)을 입력해주세요.>");
        Scanner sc5=new Scanner(System.in);
        String op2 = sc5.nextLine();
        char finalop3 = op2.charAt(0);
        while (finalop3!='+'&&finalop3!='-'&&finalop3!='*'&&finalop3!='/'&&finalop3!='=') {
            System.out.printf("연산기호를 잘못 입력하였습니다. 다시 입력해주세요. 세번째 사칙연산기호(+,-,*,/)>");
            sc5 = new Scanner(System.in);
            op2 = sc5.nextLine();
            finalop3 = op2.charAt(0);
        }
        if (finalop3=='='&&finalop=='+'&&finalop2=='+') {
            System.out.println("결과: "+ (int)(a + b + c));
            return;
        }
        if (finalop3=='='&&finalop=='+'&&finalop2=='-') {
            System.out.println("결과: "+ (int)(a + b - c));
            return;
        }
        if (finalop3=='='&&finalop=='+'&&finalop2=='*') {
            System.out.println("결과: "+ (int)((a + b) * c));
            return;
        }
        if (finalop3=='='&&finalop=='+'&&finalop2=='/'&&c!=0) {
            System.out.println("결과: "+ (int)((a + b) / c));
            return;
        }

        if (finalop3=='='&&finalop=='-'&&finalop2=='+') {
            System.out.println("결과: "+ (int)(a - b + c));
            return;
        }
        if (finalop3=='='&&finalop=='-'&&finalop2=='-') {
            System.out.println("결과: "+ (int)(a - b - c));
            return;
        }
        if (finalop3=='='&&finalop=='-'&&finalop2=='*') {
            System.out.println("결과: "+ (int)((a - b) * c));
            return;
        }
        if (finalop3=='='&&finalop=='-'&&finalop2=='/'&&c!=0) {
            System.out.println("결과: "+ (int)((a - b) / c));
            return;
        }

        if (finalop3=='='&&finalop=='*'&&finalop2=='+') {
            System.out.println("결과: "+ (int)(a * b + c));
            return;
        }
        if (finalop3=='='&&finalop=='*'&&finalop2=='-') {
            System.out.println("결과: "+ (int)(a * b - c));
            return;
        }
        if (finalop3=='='&&finalop=='*'&&finalop2=='*') {
            System.out.println("결과: "+ (int)(a * b * c));
            return;
        }
        if (finalop3=='='&&finalop=='*'&&finalop2=='/'&&c!=0) {
            System.out.println("결과: "+ (int)(a * b / c));
            return;
        }

        if (finalop3=='='&&finalop=='/'&&finalop2=='+') {
            System.out.println("결과: "+ (int)(a / b + c));
            return;
        }
        if (finalop3=='='&&finalop=='/'&&finalop2=='-') {
            System.out.println("결과: "+ (int)(a / b - c));
            return;
        }
        if (finalop3=='='&&finalop=='/'&&finalop2=='*') {
            System.out.println("결과: "+ (int)(a / b * c));
            return;
        }
        if (finalop3=='='&&finalop=='/'&&finalop2=='/'&&c!=0) {
            System.out.println("결과: "+ (int)(a / b / c));
            return;
        }

        if (finalop3!='=') {
            System.out.printf("마지막 숫자를 입력해주세요.>");
        }

        Scanner sc6=new Scanner(System.in);
        int d = sc6.nextInt();

        System.out.printf("(=)을 입력해주세요.>");
        Scanner sc7=new Scanner(System.in);
        String op3 = sc7.nextLine();
        char finalop4 = op3.charAt(0);
        while (finalop4!='=') {
            System.out.printf("마지막 계산에는 (=)만 입력할 수 있습니다.>");
            sc7 = new Scanner(System.in);
            op3 = sc7.nextLine();
            finalop4 = op3.charAt(0);
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='+'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a + b + c + d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='+'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a + b + c - d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='+'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a + b + c) * d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='+'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a + b + c) / d));
            return;
        }

        if (finalop4=='='&&finalop=='+'&&finalop2=='-'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a + b - c + d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='-'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a + b - c - d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='-'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a + b - c) * d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='-'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a + b - c) / d));
            return;
        }

        if (finalop4=='='&&finalop=='+'&&finalop2=='*'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(((a + b) * c) + d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='*'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(((a + b) * c) - d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='*'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a + b) * c * d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='*'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a + b) * c / d));
            return;
        }

        if (finalop4=='='&&finalop=='+'&&finalop2=='/'&&finalop3=='+'&&c!=0) {
            System.out.println("결과: "+ (int)(((a + b) / c) + d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='/'&&finalop3=='-'&&c!=0) {
            System.out.println("결과: "+ (int)(((a + b) / c) - d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='/'&&finalop3=='*'&&c!=0) {
            System.out.println("결과: "+ (int)((a + b) / c * d));
            return;
        }
        if (finalop4=='='&&finalop=='+'&&finalop2=='/'&&finalop3=='/'&&c!=0&&d!=0) {
            System.out.println("결과: "+ (int)((a + b) / c / d));
            return;
        }

        if (finalop4=='='&&finalop=='-'&&finalop2=='+'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a - b + c + d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='+'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a - b + c - d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='+'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a - b + c) * d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='+'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a - b + c) / d));
            return;
        }

        if (finalop4=='='&&finalop=='-'&&finalop2=='-'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a - b - c + d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='-'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a - b - c - d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='-'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a - b - c) * d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='-'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a - b - c) / d));
            return;
        }

        if (finalop4=='='&&finalop=='-'&&finalop2=='*'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(((a - b) * c) + d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='*'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(((a - b) * c) - d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='*'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a - b) * c * d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='*'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a - b) * c / d));
            return;
        }

        if (finalop4=='='&&finalop=='-'&&finalop2=='/'&&finalop3=='+'&&c!=0) {
            System.out.println("결과: "+ (int)(((a - b) / c) + d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='/'&&finalop3=='-'&&c!=0) {
            System.out.println("결과: "+ (int)(((a - b) / c) - d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='/'&&finalop3=='*'&&c!=0) {
            System.out.println("결과: "+ (int)((a - b) / c * d));
            return;
        }
        if (finalop4=='='&&finalop=='-'&&finalop2=='/'&&finalop3=='/'&&c!=0&&d!=0) {
            System.out.println("결과: "+ (int)((a - b) / c / d));
            return;
        }

        if (finalop4=='='&&finalop=='*'&&finalop2=='+'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a * b + c + d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='+'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a * b + c - d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='+'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a * b + c) * d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='+'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a * b + c) / d));
            return;
        }

        if (finalop4=='='&&finalop=='*'&&finalop2=='-'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a * b - c + d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='-'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a * b - c - d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='-'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a * b - c) * d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='-'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a * b - c) / d));
            return;
        }

        if (finalop4=='='&&finalop=='*'&&finalop2=='*'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a * b * c + d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='*'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a * b * c - d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='*'&&finalop3=='*') {
            System.out.println("결과: "+ (int)(a * b * c * d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='*'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)(a * b * c / d));
            return;
        }

        if (finalop4=='='&&finalop=='*'&&finalop2=='/'&&finalop3=='+'&&c!=0) {
            System.out.println("결과: "+ (int)(a * b / c + d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='/'&&finalop3=='-'&&c!=0) {
            System.out.println("결과: "+ (int)(a * b / c - d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='/'&&finalop3=='*'&&c!=0) {
            System.out.println("결과: "+ (int)(a * b / c * d));
            return;
        }
        if (finalop4=='='&&finalop=='*'&&finalop2=='/'&&finalop3=='/'&&c!=0&&d!=0) {
            System.out.println("결과: "+ (int)(a * b / c / d));
            return;
        }

        if (finalop4=='='&&finalop=='/'&&finalop2=='+'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a / b + c + d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='+'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a / b + c - d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='+'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a / b + c) * d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='+'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a / b + c) / d));
            return;
        }

        if (finalop4=='='&&finalop=='/'&&finalop2=='-'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a / b - c + d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='-'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a / b - c - d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='-'&&finalop3=='*') {
            System.out.println("결과: "+ (int)((a / b - c) * d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='-'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)((a / b - c) / d));
            return;
        }

        if (finalop4=='='&&finalop=='/'&&finalop2=='*'&&finalop3=='+') {
            System.out.println("결과: "+ (int)(a / b * c + d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='*'&&finalop3=='-') {
            System.out.println("결과: "+ (int)(a / b * c - d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='*'&&finalop3=='*') {
            System.out.println("결과: "+ (int)(a / b * c * d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='*'&&finalop3=='/'&&d!=0) {
            System.out.println("결과: "+ (int)(a / b * c / d));
            return;
        }

        if (finalop4=='='&&finalop=='/'&&finalop2=='/'&&finalop3=='+'&&b!=0&&c!=0) {
            System.out.println("결과: "+ (int)(a / b / c + d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='/'&&finalop3=='-'&&b!=0&&c!=0) {
            System.out.println("결과: "+ (int)(a / b / c - d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='/'&&finalop3=='*'&&b!=0&&c!=0) {
            System.out.println("결과: "+ (int)(a / b / c * d));
            return;
        }
        if (finalop4=='='&&finalop=='/'&&finalop2=='/'&&finalop3=='/'&&b!=0&&c!=0&&d!=0) {
            System.out.println("결과: "+ (int)(a / b / c / d));
        }
    }
}
