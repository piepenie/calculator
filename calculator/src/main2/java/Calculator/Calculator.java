package Calculator;

import java.util.ArrayList;
import java.util.List;

// 해당 클래스는 계산 총본부
public class Calculator {

    // Pi 값은 고정 상수이기 때문에 final 사용.
    public static final double Pi = 3.141592653589793;

    // 결과 값 창고를 Main 에서 가져옴
    List<Double> results;

    public Calculator() {
        this.results = new ArrayList<>();
    }

    public List<Double> getResults() {
        return this.results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public void removeResults() {
        if(!results.isEmpty()){
            // index : 0 << 가장 먼저 저장된 연산 결과값.
            results.remove(0);
            System.out.println("가장 첫 번째 연산 결과가 삭제 되었습니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    public void inquiryResults() {
        System.out.println("--- 저장값 리스트 ---");
        if(results.isEmpty()){
            System.out.println("저장값이 없습니다");
        } else {
            System.out.println(results);
        }
    }

}
