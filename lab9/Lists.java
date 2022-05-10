package lab9;

import java.util.*;

public class Lists {
  public static void insertFirst(ArrayList<Integer> list, int value) {
    list.add(value);
  }

  public static void insertLast(ArrayList<Integer> list, int value) {
    list.add(list.size(), value);
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
    for (int index = 0; index < list.size(); index++) {
      if (list.get(index) == 666) {
        list.remove(index);
      }
    }
  }

  public static ArrayList<Integer> generateSquare() {
    ArrayList<Integer> list = new ArrayList<>();

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
    int lengthList = list.size();
    for (int i = 0; i < lengthList / 2; i++) {
      int term = list.get(i);
      list.set(i, list.get(lengthList - i - 1));
      list.set(lengthList - i - 1, term);
    }
  }

  public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
    list.addFirst(value);
    list.addLast(value);
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    insertFirst((ArrayList<Integer>) list, 1);
    insertLast((ArrayList<Integer>) list, 2);
    insertLast((ArrayList<Integer>) list, 3);
    insertLast((ArrayList<Integer>) list, 4);
    insertLast((ArrayList<Integer>) list, 666);
    System.out.println(list);

    System.out.println("Replace the 3rd element");
    replace((ArrayList<Integer>) list, 666);
    System.out.println(list);

    System.out.println("Remove the 3rd element");
    removeThird((ArrayList<Integer>) list);
    System.out.println(list);

    System.out.println("Remove evil");
    removeEvil((ArrayList<Integer>) list);
    System.out.println(list);

    System.out.println("List square");
    List<Integer> listSquare = generateSquare();
    System.out.println(listSquare);

    reverseManual((ArrayList<Integer>) list);
    System.out.println("After reversed");
    System.out.println(list);
    System.out.println("Reversed again");
    reverse((ArrayList<Integer>) list);
    System.out.println(list);

    List<Integer> integerList = new LinkedList<>();
    System.out.println("Insert 1st element and last element");
    insertBeginningEnd((LinkedList<Integer>) integerList, 1);
    System.out.println(integerList);
  }
}
