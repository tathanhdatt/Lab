package lab10.library;

public  class Student {

  private String id;
  private String name;
  private int year;

  public Student(String id, String name, int year) {
    this.id = id;
    this.name = name;
    this.year = year;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    sb.append(", name='").append(name);
    sb.append(", year=").append(year);
    sb.append('}');
    return sb.toString();
  }
}