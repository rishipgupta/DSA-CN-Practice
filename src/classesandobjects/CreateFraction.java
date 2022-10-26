package classesandobjects;

public class CreateFraction {
    public static void main(String[] args) {
    Fraction f1 = new Fraction(2,3);
//        f1.print();
//        f1.increment();
//        f1.print();
//        f1.simplify();
//        f1.print();
//        System.out.println(f1.getNumerator());
        Fraction f2 = new Fraction(1,2);
//        f1.add(f2);
        f1.print();
        f2.print();
        Fraction f3 = Fraction.mulitply(f1,f2);
        f3.print();
    }
}
