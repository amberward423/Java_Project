public class Main {
    public static void main(String[] args) {
        Clock clock =  Clock.getInstance();
        clock.setTime(1000);
        System.out.println(clock.getTime());

        Clock clock2 =  Clock.getInstance();

        System.out.println(clock == clock2);

        EventList eventlist = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess(EventType.ARRIVAL);

        for(int i = 0; i < 10; i++ ){
                arrivalProcess.generateNextArrival(eventlist);
        }
        eventlist.displayEvents();

    }
}