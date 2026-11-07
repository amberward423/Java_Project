public class Event implements Comparable<Event> {

    private int eventTime;
    private EventType eventType;

    public Event(int eventTime, EventType eventType){
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public int compareTo(Event otherEvent){
        if (eventTime == otherEvent.eventTime){
            return 0;
        } else if (eventTime > otherEvent.eventTime){
            return 1;
        }
        else {
            return -1;
        }
    }
    public String toString(){
        return String.valueOf(eventTime) +  eventType;
    }


}
