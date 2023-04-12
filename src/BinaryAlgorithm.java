//Задача 1
//Перепишите алгоритм бинарного поиска элемента в отсортированном по возрастанию списке
// целых чисел (см. урок 56, задача 2) с использованием рекурсии.

import java.util.ArrayList;

public class BinaryAlgorithm {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(3);
    numbers.add(5);
    numbers.add(7);
    numbers.add(9);

    System.out.println(indexOf(numbers, 4, 0, numbers.size()));

  }

  /**
   * Поиск числа target в списке numbers
   *
   * @param numbers отсортированный по возрастанию список различных целых чисел
   * @param target  число, которое необходимо найти
   * @return индекс числа target в списке numbers или -1, если число не найдено
   */
  public static int indexOf(ArrayList<Integer> numbers, int target, int left, int right) {

    //condition for exit from recursion if right-left = 0 or 1 and that number is target
    if (left < numbers.size() && numbers.get(left) == target) {
      return left;
    }

    //condition for exit from recursion if correct parameter was not find
    if (right - left < 1) {
      return -1;
    }

    //find middle index and check the value if it is target
    int mid = (left + right) / 2;
    if (numbers.get(mid) == target) {
      return mid;
    }

    // recursion body, if numbers is not correct, start new function in new borders
    if (numbers.get(mid) < target) {
      return indexOf(numbers, target, mid + 1, right);
    } else { // не = и не <
      return indexOf(numbers, target, left, mid);
    }
  }
}
