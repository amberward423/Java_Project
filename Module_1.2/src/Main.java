//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EventList eventList = new EventList();

        eventList.addEvent(new Event(20));
        eventList.addEvent(new Event(80));
        eventList.addEvent(new Event(67));

        Event event1 = eventList.getNextEvent();
        System.out.println(event1);

       eventList.printEvents();




    }
}