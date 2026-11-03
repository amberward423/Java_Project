import  java.util.LinkedList;

public class ServicePoint {
    public static void main(String[] args) {
    }

    LinkedList<Task3> queue = new LinkedList<Task3>();

    void addToQueue(Task3 a) {
        queue.addFirst(a);
    }

    Task3 removeFromQueue() {
        Task3 customer = queue.getLast();
        customer.setEndTime();
        return queue.removeLast();
    }

    void serve() {
        long totalServiceTime = 0;
        int customerServed = 0;
        while (!queue.isEmpty()) {
            Task3 customer = removeFromQueue();
            long serviceStartTime = System.nanoTime();
            int serviceTime = (int) (Math.random() * 4000) + 1000;
            try {
                Thread.sleep(serviceTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            long serviceEndTime = System.nanoTime();
            long actualServiceTime = serviceEndTime - serviceStartTime;
            totalServiceTime += actualServiceTime;
            customerServed++;
            System.out.println("Time spent in the service :" + actualServiceTime);
            long response_time = customer.getTimeSpent() + actualServiceTime;
            System.out.println("Response time:" + response_time);
        }
        if (customerServed != 0) {
            long averageServiceTime = (totalServiceTime / customerServed);
            System.out.println("Average wait time:" + averageServiceTime);

        }

    }
}
