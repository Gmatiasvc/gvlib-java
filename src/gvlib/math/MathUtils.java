package gvlib.math;
/*
 * GVlib math module
 DOC: This module has various math related methods
 ? developer: Gerardo V.
 */
public class MathUtils {

    public static int fact(int x) {
        int r = 1;
        if (x == 0) {
            return 1;
        }
        for (int i = 1; i <= x; i++) {
            r = r * i;
        }
        return r;
    }

    public static Integer[] separate(int x) {
        Integer digits[] = new Integer[12];
        int i = 0;

        if (x == 0) {
            digits[0] = 0;
            return digits;
        }

        if (x < 0) {
            x = x * -1;
        }

        while (x > 9) {
            digits[i] = x % 10;
            x = x / 10;
            i++;
        }
        digits[i] = x;

        if (i % 2 == 0) {
            for (int j = 0, k = i; j < i / 2; j++, k--) {
                Integer temp;
                temp = digits[j];
                digits[j] = digits[k];
                digits[k] = temp;

            }
        } else {
            for (int j = 0, k = i; j <= (i + 1) / 2; j++, k--) {
                Integer temp;
                temp = digits[j];
                digits[j] = digits[k];
                digits[k] = temp;

            }
        }

        return digits;
    }

    public static Integer[] divs(int x) {
        Integer digits[] = new Integer[256];
        int count = 0;

        if (x == 0) {
            digits[0] = 0;
            return digits;
        }

        if (x < 0) {
            x = x * -1;
        }

        for (int i = 1; i <= x; i++) {
            //System.out.println(x+ " "+ i+ " "+ x%i);
            if (x % i == 0) {
                digits[count] = i;
                count++;
            }
        }
        return digits;
    }

    public static int mcd(Integer[] numsExt, int size) {
        Integer nums[] = numsExt;
        Integer max = Integer.MIN_VALUE;
        int counter = 0;
        int mcd = 1;
        boolean flag;
        for (Integer i : nums) {
            if (i == null) {
                size = counter;
                break;
            }
            if (i > max) {
                counter++;
                max = i;
            }
        }

        for (int i = 2; i <= max; i++) {
            flag = true;
            while (flag) {
                for (Integer j : nums) {
                    if (j % i != 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    for (int k = 0; k < size; k++) {
                        nums[k] = nums[k] / i;
                    }
                    mcd = mcd * i;
                }
            }
        }

        return mcd;
    }

    public static int mcm(Integer[] numsExt, int size) {
        Integer nums[] = numsExt;
        Integer max = Integer.MIN_VALUE;
        int counter = 0;
        int mcm = 1;
        boolean flag;
        for (Integer i : nums) {
            if (i == null) {
                size = counter;
                break;
            }
            if (i > max) {
                counter++;
                max = i;
            }
        }
        for (int i = 2; i <= max; i++) {
            flag = true;
            while (flag) {
                flag = false;
                for (Integer j : nums) {
                    if (j % i == 0 && j > 1) {
                        flag = true;
                    }
                }

                if (flag) {
                    mcm = mcm * i;
                    for (int k = 0; k < size; k++) {
                        if (nums[k] <= 1) {
                            nums[k] = 1;
                        } else {
                            if (nums[k] % i == 0) {
                                nums[k] = nums[k] / i;
                            }
                        }
                    }
                }
            }
        }
        return mcm;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double simpleInterest(float m, float p, int c){
        if (c < 1){
            return -1;
        }
        double result=m;
        for (int i = 1; i <= c; i++) {
            result += m*p;
        }
        return result;
    } 

    public static double compoundInterest(float m, float p, int c){
        if (c < 1){
            return -1;
        }
        double result=m;
        for (int i = 1; i <= c; i++) {
            result += result*p;
        }
        return result;
    }
}
