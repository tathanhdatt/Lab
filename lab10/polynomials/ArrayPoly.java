package lab10.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ArrayPoly extends AbstractPoly {
  private double[] coefficients;

  public ArrayPoly(double[] coefficients) {
    this.coefficients = coefficients;
  }

  @Override
  public double[] coefficients() {
    return this.coefficients;
  }

  @Override
  public double coefficients(int number) {
    return this.coefficients[number];
  }

  @Override
  public int degree() {
    return this.coefficients.length;
  }

  @Override
  public Poly derivative() {
    double[] derivative = new double[this.degree()];
    for (int degreeElement = 1; degreeElement < this.degree(); degreeElement++) {
      derivative[degreeElement] = (degreeElement * this.coefficients(degreeElement));
    }
    return new ArrayPoly(derivative);
  }
}
