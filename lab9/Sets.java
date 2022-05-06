package lab9;

import java.util.*;

public class Sets {
  public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {

    for (int element : first) {
      if (!second.contains(element)) {
        first.remove(element);
      }
    }
    return first;
  }

  public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
    for (int element : second) {
      first.add(element);
    }
    return first;
  }

  public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
    first.retainAll(second);
    return first;
  }
  
  public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
    first.addAll(second);
    return first;
  }

  public static List<Integer> toList(Set<Integer> source) {
    return new ArrayList<>(source);
  }

  public static List<Integer> removeDuplicates(List<Integer> source) {
    Set<Integer> set = new HashSet<>(source);
    return new ArrayList<>(set);
  }

  public static List<Integer> removeDuplicatesManual(List<Integer> source) {
    for (int i = 0; i < source.size(); i++) {
      for (int j = i + 1; j < source.size() - 1; j++) {
        if (source.get(i) == source.get(j)) {
          source.remove(j);
        }
      }
    }

    return source;
  }

  public static String firstRecurringCharacter(String s) {
    Set<Character> characterSet = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      characterSet.add(s.charAt(i));
    }
    List<Character> characterList = new ArrayList<>(characterSet);
    return characterList.get(0).toString();
  }

  public static Set<Character> allRecurringChars(String s) {
    Set<Character> characterSet = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      characterSet.add(s.charAt(i));
    }
    return characterSet;
  }

  public static Integer[] toArray(Set<Integer> source) {
    return source.toArray(new Integer[0]);
  }

  public static int getFirst(TreeSet<Integer> source) {
    return source.first();
  }

  public static int getLast(TreeSet<Integer> source) {
    return source.last();
  }

  public static int getGreater(TreeSet<Integer> source, int value) {
    return source.higher(value);
  }
}
