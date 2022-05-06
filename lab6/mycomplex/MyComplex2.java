package lab6.mycomplex;

public class MyComplex2 {
  private double real = 0.0;
  private double imag = 0.0;

  public MyComplex2() {
  }

  public MyComplex2(double real, double imag) {
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

  public boolean equals(MyComplex2 another) {
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

  public double argument() {
    return Math.atan2(imag, real);
  }

  public MyComplex2 add(MyComplex2 right) {
    this.real += right.getReal();
    this.imag += right.getImag();
    return this;
  }

  public MyComplex2 addNew(MyComplex2 right) {
    double newReal = this.real + right.getReal();
    double newImag = this.imag + right.getImag();
    return new MyComplex2(newReal, newImag);
  }

  public MyComplex2 subtract(MyComplex2 right) {
    this.real -= right.getReal();
    this.imag -= right.getImag();
    return this;
  }

  public MyComplex2 subtractNew(MyComplex2 right) {
    double newReal = this.real - right.getReal();
    double newImag = this.imag - right.getImag();
    return new MyComplex2(newReal, newImag);
  }

  public MyComplex2 multiply(MyComplex2 right) {
    this.real = this.real * right.getReal() - this.imag * right.getImag();
    this.imag = this.real * right.getImag() - this.imag * right.getReal();
    return this;
  }

  public MyComplex2 divide(MyComplex2 right) {
    if (right.isReal() && right.isImaginary()) {
      System.out.println("Complex is 0");
      return null;
    }
    double bot = right.getReal() * right.getReal() + right.getImag() * right.getImag();
    MyComplex2 newComplex = right.conjugate();
    this.real = this.multiply(newComplex).getReal() / bot;
    this.imag = this.multiply(newComplex).getImag() / bot;
    return this;
  }

  public MyComplex2 conjugate() {
    this.imag = -this.imag;
    return this;
  }
}
