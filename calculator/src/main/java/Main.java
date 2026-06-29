import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 해당 results 는 결과 값들을 보관하는 창고.
        List<Double> results = new ArrayList<>();

        while(true) {
            System.out.println("---계산기 프로그램 실행중---");

            // 값을 입력하는게 더 먼저 나와야 논리전개에 안정적임
            System.out.println("a 값을 입력해주세요 : ");
            double a = sc.nextDouble();
            System.out.println("b 값을 입력해주세요 : ");
            double b = sc.nextDouble();

            System.out.println("연산자를 입력해주세요 (+, -, *, /) : ");
            String operator = sc.next();

            // 해당 result 는 연산 단일 결과값 그자체. 0.0을 쓰던 0을 쓰던 자동으로 변환해준다니까 그냥 0으로 쓰는게 나을 듯? 이건 개발자 스타일 차이인거 같음 찾아보니까.
            double result = 0;
            // boolean 계산기 연산 확인 스위치 >> 성공 여부에 따라 해당 결과값 출력 여부를 결정
            boolean isSuccess = true;

            switch(operator) {
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
                    if (b != 0){
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

            if(isSuccess) {
                System.out.println("결과 : " + result);
                results.add(result);
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제 / 아무 키나 입력시 넘어감): ");
            String remove = sc.next();
            if(remove.equals("remove")) {
                //!results.isEmpty >> (결과값 창고가 비어있다면)의 전체 부정 ! 을 해서 안비어있다면, 으로 만듬.
                if(!results.isEmpty()){
                    // index : 0 << 가장 먼저 저장된 연산 결과값.
                    results.remove(0);
                    System.out.println("가장 첫 번째 연산 결과가 삭제 되었습니다.");
                } else {
                    System.out.println("삭제할 결과가 없습니다.");
                }
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회 / 아무 키나 입력시 넘어감): ");
            String inquiry = sc.next();
            if(inquiry.equals("inquiry")) {
                System.out.println("--- 저장값 리스트 ---");
                if(results.isEmpty()){
                    System.out.println("저장값이 없습니다");
                } else {
                    System.out.println(results);
                }
            }

            System.out.println("계산을 계속 진행하시겠습니까? (exit 입력 시 종료 / 아무 키나 입력시 계속): ");
            String exit = sc.next();
            if(exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        sc.close();
    }
}
