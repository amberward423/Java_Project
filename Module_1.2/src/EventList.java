import java.util.PriorityQueue;
public class EventList {
    private PriorityQueue<Event> events;

    public EventList (){
        this.events = new PriorityQueue <>();
    }

    public void addEvent(Event event){
        events.add(event);
    }


        public Event getNextEvent () {
        Event event = events.poll();
        return event;
    }

        public void printEvents () {
            PriorityQueue<Event> copy = new PriorityQueue<>(events);
            while(!copy.isEmpty()){
                Event pollResult = copy.poll();
                System.out.println(pollResult);

    }
    }
}
