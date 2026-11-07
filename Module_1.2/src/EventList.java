import java.util.PriorityQueue;
public class EventList {
    private PriorityQueue<Event> events;

    public EventList (){
        this.events = new PriorityQueue <>();
    }

    public void addEvent(Event events){
        events.add(event);
    }
    public Event getNextEvent(){
       Event event =   events.poll();
        return event;
    }
}
