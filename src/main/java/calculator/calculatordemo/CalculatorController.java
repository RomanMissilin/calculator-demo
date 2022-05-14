package calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController implements CalculatorInterface {
    private final CalculatorService calculatorService;

    private CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping(path = "/calculator")
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/calculator/plus")
    public int addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.addition(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public int subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public int multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiplication(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public int division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.division(num1, num2);
    }
}