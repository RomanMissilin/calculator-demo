package calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/calculator")

@RestController
public class CalculatorController implements CalculatorInterface {
    private final CalculatorService calculatorService;

    private CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public int addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorService.addition(num1, num2);
        return Integer.parseInt("num1 + num2 = " + result);
    }

    @GetMapping(path = "/minus")
    public int subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorService.subtraction(num1, num2);
        return Integer.parseInt("num1 + num2 = " + result);
    }

    @GetMapping(path = "/multiply")
    public int multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorService.multiplication(num1, num2);
        return Integer.parseInt("num1 + num2 = " + result);
    }

    @GetMapping(path = "/divide")
    public int division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return Integer.parseInt("Нельзя делить на ноль");
        } else {
            int result = calculatorService.division(num1, num2);
            return Integer.parseInt("num1 + num2 = " + result);
        }
    }
}