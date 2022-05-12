package calculator.calculatordemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class CalculatorController implements CalculatorInterface {
    private final CalculatorService calculatorService;

    private CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping (path = "/calculator")
    public String welcome() {
        return calculatorService.Welcome();
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Addition(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Subtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Multiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.Division(num1, num2);
    }
}