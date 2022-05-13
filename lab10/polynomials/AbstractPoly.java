package lab10.polynomials;

public class AbstractPoly implements Poly {

  public AbstractPoly() {
  }

  protected double[] derive() {
    return null;
  }

  @Override
  public boolean equals(Object obj) {
    return false;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public String toString() {
    return "";
  }

  @Override
  public double[] coefficients() {
    return new double[0];
  }

  @Override
  public double coefficients(int number) {
    return 0;
  }

  @Override
  public int degree() {
    return 0;
  }

  @Override
  public Poly derivative() {
    return null;
  }
}
