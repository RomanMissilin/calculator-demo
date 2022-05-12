package calculator.calculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {

    public String Welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public String Addition(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return num1 + "+" + num2 + "=" +  sum;
    }

    public String Subtraction(int num1, int num2) {
        int sum = 0;
        sum = num1 - num2;
        return num1 + "-" + num2 + "=" + sum;
    }

    public String Multiplication(int num1, int num2) {
        int sum = 0;
        sum = num1 * num2;
        return num1 + "*" + num2 + "=" + sum;
    }

    public String Division(int num1, int num2) {
        int sum = 0;
        if (num2 == 0) {
            return "На ноль делить нельзя";
        } else {
            sum = num1 / num2;
        }
        return num1 + "/" + num2 + "=" + sum;
    }
}