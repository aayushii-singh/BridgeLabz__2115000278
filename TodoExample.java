import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class ProjectTasks {
    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void login() {}

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {}

    @Todo(task = "Enhance UI responsiveness", assignedTo = "Charlie", priority = "LOW")
    public void enhanceUI() {}
}

public class TodoExample {
    public static void main(String[] args) {
        Method[] methods = ProjectTasks.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}
