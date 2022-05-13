package lab10.polynomials;

public interface Poly {
  public abstract double[] coefficients();
  public abstract double coefficients(int number);
  public abstract int degree();
  public abstract Poly derivative();
}
