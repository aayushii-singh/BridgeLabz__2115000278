import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class ExecutionTimer {
    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++);
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1000000; i++);
    }
}

public class LogExecutionTimeExample {
    public static void main(String[] args) throws Exception {
        ExecutionTimer obj = new ExecutionTimer();
        measureExecutionTime(obj, "fastMethod");
        measureExecutionTime(obj, "slowMethod");
    }

    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            method.invoke(obj);
            long end = System.nanoTime();
            System.out.println(methodName + " executed in " + (end - start) + " ns");
        }
    }
}
