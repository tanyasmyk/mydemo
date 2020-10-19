package com.company;

public class Main {
    double [] x;
    double [] y;
    double eps=0.0001;

    private void run() {
         }

    public double f(double x) {
        if (Math.abs(x-0.3)<eps) return x*x;
        return 1/(x-1);
    }


    public void fillX(double a, double b, double h) {
        int n = countPoints(a, b, h);
        x = new double[n];
        // x[0]=0;
        for (int i = 0; i < x.length; i++) {
            x[i] = a + h * i;
            //  x[i]=x[i-1]+h;
        }
    }

    public int countPoints(double a, double b, double h) {
        return (int) ((b - a) / h) + 1;
    }

    public void fillY(double [] x) {

            y= new double[x.length];
            // x[0]=0;
            for (int i = 0; i < x.length; i++) {
                y[i]=f(x[i]);
                //  x[i]=x[i-1]+h;
            }
    }

    public double sumElementArray(double[] a) {
       double sum=0;
        for (int i = 0; i < a.length; i++) sum += a[i];
        return sum;
    }
}
