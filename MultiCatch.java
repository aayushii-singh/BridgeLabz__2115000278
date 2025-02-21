import java.util.*;

public class MultiCatch {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50}; 
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter a valid number.");
        } finally {
            sc.close();
        }
    }
}
