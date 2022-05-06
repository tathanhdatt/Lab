package lab6.mycomplex;

public class TestComplex2 {
  public static void main(String[] args) {
    MyComplex2 complex = new MyComplex2(1.0, 2.0);
    System.out.println(complex);

    complex.setImag(3.0);
    complex.setReal(2.0);
    System.out.println("Real:" + complex.getReal());
    System.out.println("Imag: " + complex.getImag());
    complex.setValue(0.0, 5.0);
    System.out.println(complex);
    System.out.println("IsImaginary: " + complex.isImaginary());
    complex.setValue(5.0, 0.0);
    System.out.println(complex);
    System.out.println("IsReal: " + complex.isReal());

    MyComplex2 complex1 = new MyComplex2(1.0, 1.0);
    System.out.println(complex1);
    System.out.println("Equals: " + complex1.equals(1.0, 1.0));
    System.out.println("Equals: " + complex.equals(complex1));
    System.out.printf("Magnitude: %.2f%n", complex1.magnitude());
    System.out.println("Argument: " + complex.argument());
    System.out.println("AddInto: " + complex.add(complex1));
    System.out.println("AddNew: " + complex.addNew(complex1));
    System.out.println("Subtract: " + complex.subtract(complex1));
    System.out.println("Multiply: " + complex.multiply(complex1));
    System.out.println("Divide: " + complex.divide(complex1));
    System.out.println("Conjugate: " + complex.conjugate());
  }
}
