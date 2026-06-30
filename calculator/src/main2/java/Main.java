import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArithmeticCalculator arithCalc = new ArithmeticCalculator();
        CircleCalculator circleCalc = new CircleCalculator();

        while (true) {
            System.out.println("--- 계산기 프로그램 실행중 ---");
            System.out.println("1 사칙연산 | 2. 원의 넓이 구하기 | 3. 결과 삭제 | 4. 결과 조회 | exit. 종료");
            System.out.println("원하는 메뉴를 입력하세요.");
            String menu = sc.next();

            if (menu.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            try {
                if (menu.equals("1")) {
                    System.out.println("a 값을 입력해주세요 : ");
                    double a = sc.nextDouble();
                    System.out.println("b 값을 입력해주세요 : ");
                    double b = sc.nextDouble();
                    System.out.println("연산자를 입력해주세요 (+, -, *, /) : ");
                    String operator = sc.next();

                    double result = arithCalc.calculate(a, b, operator);
                    System.out.println("결과 : " + result);
                } else if (menu.equals("2")) {
                    System.out.println("반지름 값을 입력해주세요 : ");
                    double radius = sc.nextDouble();

                    double area = circleCalc.calculateCircleArea(radius);
                    System.out.println("원의 넓이 결과 : " + area);

                    circleCalc.inquiryResults();
                } else if (menu.equals("3")) {
                    System.out.println("어떤 결과 목록을 삭제하시겠습니까? 1. 사칙연산 | 2. 원의 넓이");
                    String select = sc.next();
                    if (select.equals("1")) {
                        arithCalc.removeResults();
                    } else if (select.equals("2")) {
                        circleCalc.removeResults();
                    }
                } else if (menu.equals("4")) {
                    System.out.println("어떤 결과 목록을 조회하시겠습니까? 1. 사칙연산 | 2. 원의 넓이");
                    String select = sc.next();
                    if (select.equals("1")) {
                        arithCalc.inquiryResults();
                    } else if (select.equals("2")) {
                        circleCalc.inquiryResults();
                    }
                } else {
                    System.out.println("메뉴를 다시 확인해주세요.");
                }
            } catch (RuntimeException e) {
                System.out.println("입력 오류: " + e.getMessage());
            }
        }
    }
}

