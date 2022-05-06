package lab6.mypolynomial;

public class TestMyPolynomial {
  public static void main(String[] args) {
    MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
    System.out.println(polynomial1);
    double[] coeffs = {1.2, 3.4, 5.6, 7.8};
    MyPolynomial polynomial2 = new MyPolynomial(coeffs);
    System.out.println(polynomial2);

    System.out.println("Add: " + polynomial1.add(polynomial2));
    System.out.println("Multiply: " + polynomial1.multiply(polynomial2));
  }
}
