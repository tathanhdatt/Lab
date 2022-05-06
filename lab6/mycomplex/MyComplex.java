package lab6.mycomplex;

public class MyComplex {
  private double real = 0.0;
  private double imag = 0.0;

  public MyComplex() {
  }

  public MyComplex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImag() {
    return imag;
  }

  public void setImag(double imag) {
    this.imag = imag;
  }

  public void setValue(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }

  @Override
  public String toString() {
    if (imag < 0) {
      return real + "-" + (-imag) + "i";
    }
    return real + "+" + imag + "i";
  }

  public boolean isReal() {
    return imag == 0;
  }

  public boolean isImaginary() {
    return real == 0;
  }

  public boolean equals(double real, double imag) {
    Double thisRealWrapper = this.real;
    Double realWrapper = real;
    Double thisImagWrapper = this.imag;
    Double imagWrapper = imag;
    return Double.compare(thisRealWrapper, realWrapper) == 0 &&
      Double.compare(thisImagWrapper, imagWrapper) == 0;
  }

  public boolean equals(MyComplex another) {
    Double thisRealWrapper = this.real;
    Double anotherRealWrapper = real;
    Double thisImagWrapper = this.imag;
    Double anotherImagWrapper = imag;
    return Double.compare(thisRealWrapper, anotherRealWrapper) == 0 &&
      Double.compare(thisImagWrapper, anotherImagWrapper) == 0;
  }

  public double magnitude() {
    return Math.sqrt(real * real + imag * imag);
  }

  public MyComplex addInto(MyComplex right) {
    this.real += right.getReal();
    this.imag += right.getImag();
    return this;
  }

  public MyComplex addNew(MyComplex right) {
    double newReal = this.real + right.getReal();
    double newImag = this.imag + right.getImag();
    return new MyComplex(newReal, newImag);
  }
}
