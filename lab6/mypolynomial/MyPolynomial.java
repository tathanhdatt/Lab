package lab6.mypolynomial;

public class MyPolynomial {
  private double[] coeffs;

  public MyPolynomial(double... coeffs) {
    this.coeffs = coeffs;
  }

  public double[] getCoeffs() {
    return this.coeffs;
  }

  public void setCoeffs(double ...coeffs) {
    this.coeffs = coeffs;
  }

  public int getDegree() {
    return this.coeffs.length - 1;
  }

  @Override
  public String toString() {
    String str = coeffs[0] + "x^" + "(" + 0 + ")";
    for(int i = 1; i <= this.getDegree(); i++) {
      str = coeffs[i] + "x^" + "(" + i + ") + " + str;
    }
    return str;
  }

  public double evaluate(double x) {
    double result = this.coeffs[this.getDegree()];
    for (int i = getDegree(); i > 0; i--) {
      result = x * result + this.coeffs[i - 1];
    }
    return result;
  }

  public MyPolynomial add(MyPolynomial right) {
    if (right == null) {
      System.out.println("Polynomial is null");
      return null;
    }
    int min  = Math.min(this.getDegree(), right.getDegree());

    if (min == this.getDegree()) {
      for (int i = 0; i <= min; i++) {
        right.getCoeffs()[i] += coeffs[i];
      }
      this.setCoeffs(right.getCoeffs());
    } else {
      for (int i = 0; i <= min; i++) {
        this.coeffs[i] += right.getCoeffs()[i];
      }
    }

    return this;
  }

  public MyPolynomial multiply(MyPolynomial right) {
    if (right == null) {
      System.out.println("Polynomial is null");
      return null;
    }
    double[] mulCoeffs = new double[this.getDegree() + right.getDegree() + 1];
    for (int i = 0; i <= this.getDegree(); i++) {
      for (int j = 0; j <= right.getDegree(); j++) {
        mulCoeffs[i + j] += coeffs[i] * right.getCoeffs()[j];
      }
    }
    this.setCoeffs(mulCoeffs);
    return this;
  }
}
