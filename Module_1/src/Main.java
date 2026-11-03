//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Task3 myTask3;

        myTask3 = new Task3();

        Task3 myTask4;

        myTask4 = new Task3();

        System.out.println(myTask3.getId());
        System.out.println(myTask4.getId());

        myTask3.setEndTime();
        myTask4.setEndTime();

        System.out.println(myTask3.getEndTime());
        System.out.println(myTask4.getEndTime());

        System.out.println(myTask3.getTimeSpent());







    }
    }
