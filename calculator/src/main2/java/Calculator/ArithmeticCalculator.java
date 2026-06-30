package Calculator;

import Operator.*;

public class ArithmeticCalculator extends Calculator{
    public AddOperator addOperator;
    public SubtractOperator subtractOperator;
    public MultiplyOperator multiplyOperator;
    public DivideOperator divideOperator;
    public ModOperator modOperator;

    public ArithmeticCalculator() {
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
        this.modOperator = new ModOperator();
    }

    public double calculate(double a, double b, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = addOperator.operate(a, b);
                break;
            case "-":
                result = subtractOperator.operate(a, b);
                break;
            case "*":
                result = multiplyOperator.operate(a, b);
                break;
            case "/":
                result = divideOperator.operate(a,b);
                break;
        }
        getResults().add(result);
        return result;
    }

}
