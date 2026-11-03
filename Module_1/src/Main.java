//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ServicePoint myServicePoint;
        myServicePoint = new ServicePoint();


        CustomerGenerator myCustomerGenerator;

        myCustomerGenerator = new CustomerGenerator(5, myServicePoint);



        myServicePoint.serve();



    }
    }
