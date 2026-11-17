import java.util.ArrayList;

public class EventList {
    private ArrayList<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event event){
        eventList.add(event);
    }

    public void displayEvents(){
        for (int i = 0; i < eventList.size(); i++) {
            Event event= eventList.get(i);
            System.out.println(event.getTime());
            System.out.println(event.getType());

        }

    }
}
