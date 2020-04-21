public class Interval {

    public static void showEvenValuesForIntervalAndTheirSum(int min, int max) {
        int evenSum = 0;
        for (int i = min; i <= max; i++) {
            if (isEven(i)) {
                System.out.println(i + " is even value");
                evenSum += i;
            }
        }
        System.out.println("Sum of all above is: " + evenSum);
    }

    public static boolean isEven(int i) {
        return ((i % 2) == 0);
    }
}




