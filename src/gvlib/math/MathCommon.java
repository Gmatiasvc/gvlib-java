package gvlib.math;

public class MathCommon {

    public static double pow(double base, int exp) {
        double answr = 1.0;

        if (exp >= 0) {
            for (int i = 0; i < exp; i++) {
                answr *= base;
            }
        }

        else{
            exp *= -1;
            for (int i = 0; i < exp; i++) {
                answr /= base;
            }
        }
        return answr;
    }
}
