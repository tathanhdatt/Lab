package lab8.animal;

public class BigDog extends Dog {

  public BigDog(String name) {
    super(name);
  }

  @Override
  public void greets() {
    System.out.println("Woo-ow");
  }

  @Override
  public void greets(Dog another) {
    System.out.println("Woooooow");
  }

  public void greets(BigDog another) {
    System.out.println("Wooooooooooow");
  }
}
