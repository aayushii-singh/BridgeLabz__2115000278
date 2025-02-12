class Task {
    int taskId, priority;
    String taskName, dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class CircularLinkedList {
    Task head;

    public void addB(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newTask;
            head = newTask;
        }
    }

    public void addE(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newTask;
            newTask.next = head;
        }
    }

    public void addS(int taskId, String taskName, int priority, String dueDate, int pos) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (pos == 1) {
            addB(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newTask.next = temp.next;
        temp.next = newTask;
    }

    public void delTask(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId) {
            if (head.next == head) {
                head = null;
            } else {
                Task temp = head;
                while (temp.next != head) temp = temp.next;
                head = head.next;
                temp.next = head;
            }
            return;
        }
        Task temp = head;
        while (temp.next != head && temp.next.taskId != taskId) temp = temp.next;
        if (temp.next != head) temp.next = temp.next.next;
    }

    public void viewNext() {
        if (head == null) return;
        System.out.println("Current Task: " + head.taskName);
        head = head.next;
    }

    public void searchPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Task: " + temp.taskName + " with Priority: " + temp.priority);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void displayAll() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskMain {
    public static void main(String[] args) {
        CircularLinkedList taskList = new CircularLinkedList();

        taskList.addE(1, "Task1", 5, "2025-02-01");
        taskList.addE(2, "Task2", 3, "2025-02-10");
        taskList.addB(0, "Task0", 4, "2025-01-30");
        taskList.addS(3, "Task3", 2, "2025-02-15", 2);

        taskList.displayAll();

        taskList.viewNext();

        taskList.searchPriority(3);

        taskList.delTask(2);
        taskList.displayAll();
    }
}
