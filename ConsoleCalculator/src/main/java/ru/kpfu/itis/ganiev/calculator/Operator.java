package ru.kpfu.itis.ganiev.calculator;

public class Operator {

    private final char mathOperator;

    public Operator(char mathOperator) {
        this.mathOperator = mathOperator;
    }

    public int calculate(int x, int y) {
        int result;
        switch (mathOperator) {
            case ('+'):
                result = x + y;
                break;
            case ('-'):
                result = x - y;
                break;
            case ('*'):
                result = x * y;
                break;
            default:
                throw new ArithmeticException("Error: illegal operation.");
        }
        return result;
    }

}
