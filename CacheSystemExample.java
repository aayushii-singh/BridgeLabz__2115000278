import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class ExpensiveCalculator {
    private final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeSquare(int number) {
        if (cache.containsKey(number)) {
            System.out.println("Returning cached result for: " + number);
            return cache.get(number);
        }
        System.out.println("Computing square for: " + number);
        int result = number * number;
        cache.put(number, result);
        return result;
    }
}

public class CacheSystemExample {
    public static void main(String[] args) throws Exception {
        ExpensiveCalculator calculator = new ExpensiveCalculator();
        System.out.println(calculator.computeSquare(5));
        System.out.println(calculator.computeSquare(5)); 
        System.out.println(calculator.computeSquare(10));
        System.out.println(calculator.computeSquare(10)); 
    }
}
