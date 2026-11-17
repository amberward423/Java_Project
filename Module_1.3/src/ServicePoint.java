import java.util.LinkedList;
public class ServicePoint {
    private LinkedList<Customer> customers = new LinkedList<Customer>();

    public void addCustomer(Customer customer){
        customers.addLast(customer);
    }

    public Customer removeCustomer(){
        return customers.removeFirst();
    }

    public long calculateTimeInSystem(Customer customer){
       long currentTime = Clock.getInstance().getTime();
       long arrivalTime = customer.getArrivalTime();
       long timeinside = currentTime - arrivalTime;
       return timeinside;
    }

    public boolean isEmpty(){
        return customers.isEmpty();
    }

}
