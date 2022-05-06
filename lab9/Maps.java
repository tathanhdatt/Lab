package lab9;

import java.util.*;

public class Maps {
  public static int count(Map<Integer, Integer> map) {
    return map.size();
  }

  public static void empty(Map<Integer, Integer> map) {
    map.clear();
  }

  public static boolean contains(Map<Integer, Integer> map, int key) {
    return map.containsKey(key);
  }

  public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
    return map.containsKey(key) && map.get(key) == value;
  }

  public static Set<Integer> keySet(Map<Integer, Integer> map) {
    return  map.keySet();
  }

  public static Collection<Integer> values(Map<Integer, Integer> map) {
    return map.values();
  }

  public static String getColor(int value) {
    Map<Integer, String> colorMap = new HashMap<>();
    colorMap.put(0, "black");
    colorMap.put(1, "white");
    colorMap.put(2, "red");

    return colorMap.get(value);
  }
}
