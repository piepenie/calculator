public class ModOperator implements Operator{
    @Override
    public double operate (double a, double b) {
        if(b == 0) {
            System.out.println("나머지 연산에서 분모는 0이 될 수 없습니다.");
        }
        return a % b;
    }
}
