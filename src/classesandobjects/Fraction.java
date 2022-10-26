package classesandobjects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public void simplify() {
        int gcd = 1;
        for (int i = 1; i <= Math.min(numerator, denominator); i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }

    public void increment(){
        numerator = numerator + denominator;
        denominator = denominator;
    }

    //to set numerator of a fraction
    public void setNumerator(int num){
        this.numerator = num;
        simplify();
    }
    //to get numerator of a fraction
    public int getNumerator(){
        return numerator;
    }
    //to set numerator of a fraction
    public void setDenominator(int num){
        if(num == 0 ){
            return;
        }
        this.denominator = num;
        simplify();
    }
    //to get numerator of a fraction
    public int getDenominator(){
        return denominator;
    }

    //to add fractions and show result as modified first fraction
    public void add(Fraction f2){
        int newNum = this.numerator*f2.denominator + this.denominator*f2.numerator;
        int newDen = this.denominator * f2.denominator;
        this.numerator = newNum;
        this.denominator = newDen;
    }

    //Multiplication Functionality and creating result as new third fraction
    public static Fraction mulitply(Fraction f1,Fraction f2){
        int newNum = f1.numerator * f2.numerator;
        int newDen = f1.denominator* f2.denominator;
        Fraction f3 = new Fraction(newNum,newDen);
        return f3;
    }

//print functionality
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
}
