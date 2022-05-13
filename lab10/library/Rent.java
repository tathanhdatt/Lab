package lab10.library;

import java.util.Date;

public class Rent {
  protected Item item;
  protected Date end;
  protected Student student;
  protected Date begin;

  public Rent(Item item, Date end, Student student, Date begin) {
    this.item = item;
    this.end = end;
    this.student = student;
    this.begin = begin;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Date getBegin() {
    return begin;
  }

  public void setBegin(Date begin) {
    this.begin = begin;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Rent{");
    sb.append("item=").append(item);
    sb.append(", end=").append(end);
    sb.append(", student=").append(student);
    sb.append(", begin=").append(begin);
    sb.append('}');
    return sb.toString();
  }
}
