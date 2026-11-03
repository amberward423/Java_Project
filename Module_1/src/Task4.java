import  java.util.LinkedList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        LinkedList<Task3> queue = new LinkedList<Task3>();
        Scanner scanner = new Scanner(System.in);

        int choice = 1;

while (choice != 3) {
    System.out.println("1.) Do you want to add a customer?");

    System.out.println("2.) Do you want to remove a customer?");

    System.out.println("3.) Do you want to Exit?");

     choice = scanner.nextInt();

    if (choice == 1) {
        Task3 myTask3;

        myTask3 = new Task3();

        queue.addFirst(myTask3);
    } else if (choice == 2) {
        if (queue.size() > 0) {
          Task3 customer = queue.getLast();
            customer.setEndTime();
            queue.removeLast();
            System.out.println("Time spent waiting: " + customer.getTimeSpent());
        } else {
            System.out.println("The queue is empty.");
        }
    } else {
        break;
    }
}




    }

}
