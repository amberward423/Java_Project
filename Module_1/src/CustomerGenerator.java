public class CustomerGenerator {
    private int customers;
    private ServicePoint servicePoint;

    public CustomerGenerator(int customers, ServicePoint servicePoint){

        this.customers = customers;
        this.servicePoint = servicePoint;

        for (int i = 0; i < customers; i++){
            Task3 myTask3;
            myTask3 = new Task3();

            servicePoint.addToQueue(myTask3);


        }
    }

}
