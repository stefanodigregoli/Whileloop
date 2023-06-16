// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class WhileExercise {
    public static void main(String[] args) {
        int botHolding = 1000;
        int botSellingForDay = 1000;
        int dayCounter = 0;
        // double exchangeRate = 0;

        while (botHolding > 0){
            double exchangeRate = 1 + (Math.random() * 0.2);
            if (exchangeRate > 1.15) {
                botHolding -= botSellingForDay;
            }
            dayCounter++;
        }
        System.out.println(dayCounter);
    }
}
