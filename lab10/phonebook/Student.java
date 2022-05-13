package lab10.phonebook;

public  class Student {

  private String id;
  private String firstName;
  private String lastName;
  private int year;

  public Student(String id, String firstName,String lastName, int year) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.year = year;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Student{");
    sb.append("id='").append(id);
    sb.append("firstName='").append(firstName);
    sb.append(", lastName='").append(lastName);
    sb.append(", year=").append(year);
    sb.append('}');
    return sb.toString();
  }
}