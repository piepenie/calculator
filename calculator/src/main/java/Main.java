import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 해당 results 는 결과 값들을 보관하는 창고.
        List<Double> results = new ArrayList<>();


        while(true){
            System.out.println("---계산기 프로그램 실행중---");

            // 값을 입력하는게 더 먼저 나와야 논리전개에 안정적임
            System.out.println("a 값을 입력해주세요 : ");
            double a = sc.nextDouble();
            System.out.println("b 값을 입력해주세요 : ");
            double b = sc.nextDouble();

            System.out.println("연산자를 입력해주세요 (+, -, *, /) : ");
            String operator = sc.next();


            // 해당 result 는 연산 단일 결과값 그자체.
            double result = 0.0;
            // boolean
            boolean isSuccess = true;


            switch (operator){
                case "+":
                    result = a + b;
                    break;

                case "-":
                    result = a - b;
                    break;

                case "*":
                    result = a * b;
                    break;

                case "/":
                    if (b != 0.0 ){
                        result = a / b;
                    } else {
                        System.out.println("0으로는 나눌 수 없습니다.");
                        isSuccess = false;
                    }
                    break;
                default:
                    System.out.println("연산자를 다시 확인해주세요.");
                    isSuccess = false;
                    break;
            }

            if(isSuccess){
                System.out.println("결과 : " + result);
                results.add(result);
            }
        }

    }
}
