package ru.kpfu.itis.ganiev.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {

    @Bean
    public Operator addition() {
        return new Operator('+');
    }

    @Bean
    public Operator subtraction() {
        return new Operator('-');
    }

    @Bean
    public Operator multiplication() {
        return new Operator('*');
    }

    @Bean
    public ComplexOperator multipleOperations() {
        return new ComplexOperator(addition(), multiplication(), subtraction());
    }

}
