package lists;

public class IntegerArrayUtils {

    public static int minArrayInt(Integer[] arr) {
        int min = Integer.MAX_VALUE;

        for (Integer i : arr) {
            if (i == null) {
                break;
            }
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public static int maxArrayInt(Integer[] arr) {
        int max = Integer.MIN_VALUE;

        for (Integer i : arr) {
            if (i == null) {
                break;
            }
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public static double medArrayInt(Integer[] arr) {
        double sum = 0;
        int count = 0;

        for (Integer i : arr) {
            if (i == null) {

                break;
            }
            sum = sum + i;
            count++;
        }

        if (count == 0) {
            count = 1;
        }

        sum = sum / count;

        return sum;
    }

}
