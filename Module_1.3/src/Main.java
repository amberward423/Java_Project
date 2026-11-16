
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Clock clock =  Clock.getInstance();
        clock.setTime(1000);
        System.out.println(clock.getTime());

        Clock clock2 =  Clock.getInstance();


    }
}