import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueRandomNumberGenerator {
  private Random random;

  public UniqueRandomNumberGenerator(Random random) {
    this.random = random;
  }

  public Set<Integer> getXUniqueRandomInts(int range, int size) {
    Set<Integer> randomInts = new HashSet<>();
    while (randomInts.size() < size) {
      randomInts.add(random.nextInt(range));
    }
    return randomInts;
  }
}
