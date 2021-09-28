//
// Chapter 11, plus some extra practice for our OOP test
//
public class Fraction {
    private int num;
    private int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
        this.cancel();
    }

    // overloaded constructor
    public Fraction() {
        this.num = 0;
        this.den = 1;
    }

    public double toDecimal() {
        return (double) this.num / (double) this.den;
    }

    // calculate the GCD to simplify a fraction
    private static int gcd(int n, int m) {
        int gcd;
        if (n == m)
            gcd = n;
        else {
            while (n != m) {
                if (n < m)
                    m = m - n;
                else
                    n = n - m;
            }
        }
        return n;
    }

    public void cancel() // simplify
    {
        int gcd = gcd(this.num, this.den);
        this.num = this.num / gcd;
        this.den = this.den / gcd;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    // Practice for the test: write the add, equals and compareTo methods
    public Fraction add(Fraction second) {
        int resultNumerator = this.num * second.den + this.den * second.num;
        int resultDenominator = this.den * second.den;

        return new Fraction(resultNumerator, resultDenominator);
    }

    public boolean equals(Fraction second) {
        double compare = this.toDecimal() - second.toDecimal();
        if (compare == 0) {
            return true;
        } else {
            return false;
        }
    }

    public double compareTo(Fraction second) {
        double compare = this.toDecimal() - second.toDecimal();
        if (compare == 0) {
            return 0;
        } else if (compare < 0) {
            return -1;
        } else {
            return 1;
        }

    }

    public String toString() {
        return this.num + "/" + this.den;
    }
}
