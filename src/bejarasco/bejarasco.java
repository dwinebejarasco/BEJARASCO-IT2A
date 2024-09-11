import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Tasks: ");
        int numTasks = scanner.nextInt();

        Task[] tasks = new Task[numTasks];

        for (int i = 0; i < numTasks; i++) {
            System.out.println("Enter details of task " + (i + 1) + ":");

            System.out.print("Task ID: ");
            int taskId = scanner.nextInt();

            System.out.print("Task Name: ");
            String taskName = scanner.next();

            System.out.print("Assigned To: ");
            String assignedTo = scanner.next();

            System.out.print("Due Date (yyyy-MM-dd): ");
            String dueDate = scanner.next();

            System.out.print("Priority: ");
            String priority = scanner.next();

            System.out.print("Status: ");
            String status = scanner.next();

            tasks[i] = new Task(taskId, taskName, assignedTo, dueDate, priority, status);
        }

        System.out.println("Task ID\tTask Name\tAssigned To\tDue Date\tPriority\tStatus");
        for (Task task : tasks) {
            System.out.println(task.taskId + "\t" + task.taskName + "\t" + task.assignedTo + "\t" + task.dueDate + "\t" + task.priority + "\t" + task.status);
        }
    }
}
