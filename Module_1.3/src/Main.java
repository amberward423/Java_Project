public class Main {
    public static void main(String[] args) {
        Clock clock =  Clock.getInstance();
        clock.setTime(1000);
        System.out.println(clock.getTime());

        Clock clock2 =  Clock.getInstance();

        System.out.println(clock == clock2);

        EventList eventlist = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess(EventType.ARRIVAL);
        ServicePoint servicePoint = new ServicePoint();


        for(int i = 0; i < 10; i++ ){
                arrivalProcess.generateNextArrival(eventlist);
        }
        eventlist.displayEvents();
        System.out.println(clock.getTime());

        while (!eventlist.isEmpty()){

            Event nextEvent = eventlist.getNextEvent();
            long arrivalTime = nextEvent.getTime();

            Customer customer = new Customer(arrivalTime);
            servicePoint.addCustomer(customer);
        }

        clock.setTime(clock.getTime() + 5);

        while(!servicePoint.isEmpty()){
           Customer customer =  servicePoint.removeCustomer();
            long timeInSystem = servicePoint.calculateTimeInSystem(customer);
            System.out.println(timeInSystem);

        }

    }


}