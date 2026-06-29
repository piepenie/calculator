import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---계산기 프로그램 실행중---");

        System.out.println("연산자를 입력해주세요 (+, -, *, /) : ");
        String operator = sc.next();

        System.out.println("a 값을 입력해주세요 : ");
        int a = sc.nextInt();
        System.out.println("b 값을 입력해주세요 : ");
        int b = sc.nextInt();

        switch (operator){
            case "+":
                System.out.println("a+b의 값 : " + (a + b));
                break;

            case "-":
                System.out.println("a-b의 값 : " + (a - b));
                break;

            case "*":
                System.out.println("a*b의 값 : " + (a * b));
                break;

            case "/":
                if (b != 0 ){
                    System.out.println("a/b의 값 : " + (a / b));
                } else {
                    System.out.println("0으로는 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("연산자를 다시 확인해주세요.");
                break;
        }

        sc.close();
    }
}
