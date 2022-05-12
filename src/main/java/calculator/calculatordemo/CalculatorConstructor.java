package calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorConstructor {
    private final CalculatorService calculatorService;

    private CalculatorConstructor(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String Welcome() {
        return calculatorService.Welcome();
    }

    @GetMapping(path = "/calculator/plus")
    public String Addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Addition(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String Subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Subtraction(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String Multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Multiplication(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String Division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Division(num1, num2);
    }
}