package lab9;

import java.util.*;

public class Lists {
  public static void insertFirst(ArrayList<Integer> list, int value) {
    list.add(value);
  }

  public static void insertLast(ArrayList<Integer> list, int value) {
    list.add(value, list.size() - 1);
  }

  public static void replace(ArrayList<Integer> list, int value) {
    if (list.size() > 2) {
      list.set(2, value);
    }
  }

  public static void removeThird(ArrayList<Integer> list) {
    list.remove(2);
  }

  public static void removeEvil(ArrayList<Integer> list) {
    for (Integer element : list) {
      if (element == 666) {
        list.remove(element);
      }
    }
  }

  public static ArrayList<Integer> generateSquare() {
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 1; i < 11; i++) {
      list.add(i * i);
    }

    return list;
  }

  public static boolean contains(ArrayList<Integer> list, int value) {
    for (int index = 0; index < list.size(); index++) {
      if (list.get(index) == value) {
        return true;
      }
    }

    return false;
  }

  public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
    target = new ArrayList<>(source);
  }

  public static void reverse(ArrayList<Integer> list) {
    Collections.reverse(list);
  }

  public static void reverseManual(ArrayList<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int term = list.get(i);
      list.set(i, list.get(i + 1));
      list.set(i + 1, term);
    }
  }

  public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
    list.addFirst(value);
    list.addLast(value);
  }
}
