public class Interval {
    private int evenSum;
    private final int min;
    private final int max;
    private final int[] evenValues;
    private int evenCounter;

    public Interval(int min, int max) {

        this.min = min;
        this.max = max;
        this.evenSum = 0;
        //all possibilities to check in order to create appropriate exact table size - my goal to not create bigger table size, I know it's worthless ;)
        if (((max - min) % 2 == 0) && ((max % 2 != 0))) {
            this.evenValues = new int[((max - min) / 2)];
        } else {
            this.evenValues = new int[((max - min) / 2) + 1];
        }
        this.evenCounter = 0;

    }

    public void displayEvenValues() {
        System.out.println("\nAll even values for interval [" + min + "," + max + "]:");
        for (int evenValue : evenValues) {
            if (evenCounter != 0)
                System.out.print(evenValue + " ");
        }
    }

    public void displaySumOfEvenValues() {
        System.out.println("\nSum of all even values for interval [" + min + "," + max + "]:");
        System.out.println(evenSum);
    }

    public void lookForEvenValues() {

        for (int i = min; i <= max; i++) {
            if ((i % 2) == 0) {
                evenValues[evenCounter] = i;
                evenCounter++;
                evenSum += i;
            }
        }
    }
}




