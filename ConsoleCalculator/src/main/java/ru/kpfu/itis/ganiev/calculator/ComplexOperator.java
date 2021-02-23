package ru.kpfu.itis.ganiev.calculator;

public class ComplexOperator {

    private final Operator firstOperator;
    private final Operator secondOperator;
    private final Operator thirdOperator;

    public ComplexOperator(Operator firstOperator, Operator secondOperator, Operator thirdOperator) {
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
        this.thirdOperator = thirdOperator;
    }

    public int calculate(int a, int b, int c, int d) {
        return thirdOperator.calculate(secondOperator.calculate(firstOperator.calculate(a, b), c), d);
    }

}
