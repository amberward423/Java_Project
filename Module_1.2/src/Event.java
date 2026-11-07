public class Event implements Comparable<Event> {
    private int eventTime;

    public Event(int eventTime){
        this.eventTime = eventTime;
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

}
