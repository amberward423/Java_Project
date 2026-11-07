//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EventList eventList = new EventList();

        eventList.addEvent(new Event(20,EventType.ARRIVAL));
        eventList.addEvent(new Event(80,EventType.EXIT));
        eventList.addEvent(new Event(67,EventType.ARRIVAL));

        Event event1 = eventList.getNextEvent();
        System.out.println(event1);

       eventList.printEvents();




    }
}