package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InsertionSorter {
  public static List<Integer> sort(Collection<Integer> list) {
    List<Integer> sorted = new ArrayList<>();
    for(int i : list) {
      if(sorted.isEmpty()) {
        sorted.add(i);
        continue;
      }

      boolean inserted = false;
      for(int j = 0; j < sorted.size(); j++) {
        if(i < sorted.get(j)) {
          sorted.add(j, i);
          inserted = true;
          break;
        }
      }

      if(!inserted) {
        sorted.add(i);
      }
    }

    return sorted;
  }
}
