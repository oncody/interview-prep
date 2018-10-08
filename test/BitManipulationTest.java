import java.util.BitSet;
import org.junit.jupiter.api.Test;

class BitManipulationTest {
  @Test
  public void test(){
    BitSet bitSet = new BitSet();
    System.out.println(bitSet);

    bitSet.clear(2);
    System.out.println(bitSet);

    bitSet.set(2);
    System.out.println(bitSet);

    bitSet.set(4);
    System.out.println(bitSet);
  }
}
