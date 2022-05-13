package lab10.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
  protected List<Double> coefficients;

  public ListPoly(List<Double> coefficients) {
    this.coefficients = coefficients;
  }

  @Override
  public double[] coefficients() {
    double[] coefficients = new double[this.degree()];
    for (int i = 0; i < this.degree(); i++) {
      coefficients[i] = this.coefficients.get(i);
    }
    return coefficients;
  }

  @Override
  public double coefficients(int number) {
    return this.coefficients.get(number);
  }

  @Override
  public int degree() {
    return this.coefficients.size();
  }

  @Override
  public Poly derivative() {
    List<Double> derivative = new ArrayList<>();
    for (int degreeElement = 1; degreeElement < this.degree(); degreeElement++) {
      derivative.add(degreeElement * this.coefficients.get(degreeElement));
    }
    return new ListPoly(derivative);
  }
}
