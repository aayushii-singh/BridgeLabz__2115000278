import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

class Task {
    public void taskOne() {
        for (int i = 0; i < 1_000_000; i++);
    }

    public void taskTwo() {
        try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

public class MethodExecutionTiming {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        Method[] methods = Task.class.getDeclaredMethods();

        for (Method method : methods) {
            Instant start = Instant.now();
            method.invoke(task);
            Instant end = Instant.now();
            System.out.println(method.getName() + " execution time: " + Duration.between(start, end).toMillis() + " ms");
        }
    }
}
