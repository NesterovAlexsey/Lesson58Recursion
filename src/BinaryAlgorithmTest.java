import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class BinaryAlgorithmTest {

  @Test
  public void normalWorkLogicTest() {
    BinaryAlgorithm test = new BinaryAlgorithm();

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(3);
    numbers.add(5);
    numbers.add(7);
    numbers.add(9);

    int index1 = test.myIndexOf(numbers, 1, 0, numbers.size());
    int index2 = test.myIndexOf(numbers, 2, 0, numbers.size());
    int index3 = test.myIndexOf(numbers, 9, 0, numbers.size());
    int index4 = test.myIndexOf(numbers, 12, 0, numbers.size());
    int index5 = test.myIndexOf(numbers, -35, 0, numbers.size());
    int index6 = test.myIndexOf(numbers, 0, 0, numbers.size());
    int index7 = test.myIndexOf(numbers, 5, 0, numbers.size());

    assertEquals(0, index1);
    assertEquals(-1, index2);
    assertEquals(4, index3);
    assertEquals(-1, index4);
    assertEquals(-1, index5);
    assertEquals(-1, index6);
    assertEquals(2, index7);
  }
}
