import java.lang.annotation.*;
import java.lang.reflect.*;

@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@interface BugReports {
    BugReport[] value();
}

class BugTracker {
    @BugReport(description = "Null pointer exception occurs in edge cases")
    @BugReport(description = "Performance issue when processing large data")
    public void process() {
        System.out.println("Processing...");
    }
}

public class BugReportExample{
    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("process");
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);
        for (BugReport report : bugReports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
