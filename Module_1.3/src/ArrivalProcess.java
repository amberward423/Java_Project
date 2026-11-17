import eduni.distributions.distributions.Normal;

public class ArrivalProcess {
    private EventType eventType;
    private Normal normal;

    public ArrivalProcess(EventType eventType){
        this.eventType = eventType;
        normal = new Normal(10,4);
    }
     public void generateNextArrival(EventList eventlist) {
         Clock clock = Clock.getInstance();
         long currentTime = clock.getTime();
         long interval = (long) normal.sample();

         while (interval <= 0) {
              interval = (long) normal.sample();
         }
         long nextTime = currentTime + interval;
         clock.setTime(nextTime);

         Event event1 = new Event(nextTime, eventType);
         eventlist.addEvent(event1);
     }
}
