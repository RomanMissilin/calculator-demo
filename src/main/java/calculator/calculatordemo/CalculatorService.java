package calculator.calculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public int addition(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

    public int subtraction(int num1, int num2) {
        int sum = 0;
        sum = num1 - num2;
        return sum;
    }

    public int multiplication(int num1, int num2) {
        int sum = 0;
        sum = num1 * num2;
        return sum;
    }

    public int division(int num1, int num2) {
        int sum = 0;
        sum = num1 / num2;
        return sum;
    }
}