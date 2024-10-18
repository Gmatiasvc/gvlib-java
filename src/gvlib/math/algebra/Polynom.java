package gvlib.math.algebra;

import gvlib.math.MathCommon;

public class Polynom {

    private int ad;
    private double coef[];

    public Polynom(int ad) {
        this.ad = ad;
        coef = new double[ad];
    }

    public Polynom(int ad, double[] coef) {
        this.ad = ad;
        this.coef = coef;
    }

    public double evaluate(int x) {
        double sum = 0;
        for (int i = 0; i < ad; i++) {
            sum += coef[i] * MathCommon.pow(x, i);
        }
        return sum;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public double[] getCoef() {
        return coef;
    }

    public void setCoef(double[] coef) {
        if (coef.length > ad) {
            this.coef = coef;
        }
    }

    public void setCoefPos(int pos, double cf) {
        if (pos > -1 && pos < ad) {
            coef[pos] = cf;
        }
    }
}