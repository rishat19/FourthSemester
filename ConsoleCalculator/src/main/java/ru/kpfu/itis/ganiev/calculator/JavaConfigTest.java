package ru.kpfu.itis.ganiev.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class JavaConfigTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Operator operator;
        ComplexOperator complexOperator;
        ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfig.class);
        System.out.println("Enter the first number:");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter one of the operations: +, - or *:");
        while (true) {
            String mathOperator = scanner.nextLine();
            if (mathOperator.equals("+")) {
                operator = (Operator) context.getBean("addition");
                break;
            }
            if (mathOperator.equals("-")) {
                operator = (Operator) context.getBean("subtraction");
                break;
            }
            if (mathOperator.equals("*")) {
                operator = (Operator) context.getBean("multiplication");
                break;
            }
            System.out.println("Invalid operator. Try again:");
        }
        System.out.println("Enter the second number:");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("Result:");
        System.out.println(operator.calculate(x, y));

        System.out.println("Enter the first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the third number:");
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the fourth number:");
        int d = Integer.parseInt(scanner.nextLine());
        complexOperator = (ComplexOperator) context.getBean("multipleOperations");
        System.out.println("Result:");
        System.out.print("(" + a + " + " + b + ") * " + c + " - " + d + " = ");
        System.out.println(complexOperator.calculate(a, b, c, d));
    }

}
