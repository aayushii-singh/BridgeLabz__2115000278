import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class User {
    private String role;

    public User(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully!");
    }

    public void checkAccessAndExecute(User user, String methodName) {
        try {
            Method method = this.getClass().getMethod(methodName);
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();
                if (user.getRole().equals(requiredRole)) {
                    method.invoke(this);
                } else {
                    System.out.println("Access Denied!");
                }
            } else {
                method.invoke(this);
            }
        } catch (Exception e) {
            System.out.println("Method not found or error executing method.");
        }
    }
}

public class RoleAccessExample {
    public static void main(String[] args) {
        SecureService service = new SecureService();

        User adminUser = new User("ADMIN");
        User normalUser = new User("USER");

        System.out.println("Trying with ADMIN:");
        service.checkAccessAndExecute(adminUser, "adminTask");

        System.out.println("Trying with USER:");
        service.checkAccessAndExecute(normalUser, "adminTask");
    }
}
