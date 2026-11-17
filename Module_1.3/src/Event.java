import java.util.ArrayList;

public class Event {
    private long time;
    private EventType type;

    public Event(long time, EventType type){
        this.time = time;
        this.type= type;
    }

    public long getTime(){
        return time;
    }

    public EventType getType(){
        return type;
    }


}
