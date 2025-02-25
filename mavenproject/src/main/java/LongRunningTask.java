
public class LongRunningTask {
    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(1500);
        return "Task Completed";
    }
}
