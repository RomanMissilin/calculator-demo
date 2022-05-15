package calculator.calculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String addition(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return "sum";
    }

    public String subtraction(int num1, int num2) {
        int sum = 0;
        sum = num1 - num2;
        return "sum";
    }

    public String multiplication(int num1, int num2) {
        int sum = 0;
        sum = num1 * num2;
        return "sum";
    }

    public String division(int num1, int num2) {
        int sum = 0;
        sum = num1 / num2;
        return "sum";
    }
}