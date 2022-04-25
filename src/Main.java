import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int ticketPrice = 7000;
        int amountRubles = 20;

        int amountMiles = ticketPrice / amountRubles;

        System.out.println("Начислено бонусных миль: "+ amountMiles);


    }
}
