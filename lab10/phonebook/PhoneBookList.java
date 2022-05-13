package lab10.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
  protected ArrayList<Student> phoneBook;

  public PhoneBookList() {
  }

  public PhoneBookList(ArrayList<Student> phoneBook) {
    this.phoneBook = phoneBook;
  }

  @Override
  public Student searchByLastname(String lastName) {
    for (Student student : phoneBook) {
      if (student.getLastName().equals(lastName)) {
        return student;
      }
    }
    return null;
  }

  @Override
  public Student searchByNumber(String id) {
    for (Student student : phoneBook) {
      if (student.getId().equals(id)) {
        return student;
      }
    }
    return null;
  }

  @Override
  public void addPerson(Student student) {
    this.phoneBook.add(student);
  }

  @Override
  public Student searchByName(String name) {
    for (Student student : phoneBook) {
      if ((student.getFirstName() + " " + student.getLastName()).equals(name)) {
        return student;
      }
    }
    return null;
  }

  @Override
  public void deleteByNumber(String id) {
    for (Student student : phoneBook) {
      if (student.getId().equals(id)) {
        this.phoneBook.remove(student);
      }
    }
  }
}
