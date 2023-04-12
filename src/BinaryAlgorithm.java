//Задача 1
//Перепишите алгоритм бинарного поиска элемента в отсортированном по возрастанию списке
// целых чисел (см. урок 56, задача 2) с использованием рекурсии.

import java.util.ArrayList;

public class BinaryAlgorithm {

  /**
   * Поиск числа target в списке numbers
   *
   * @param numbers отсортированный по возрастанию список различных целых чисел
   * @param target  число, которое необходимо найти
   * @return индекс числа target в списке numbers или -1, если число не найдено
   */
  public static int myIndexOf(ArrayList<Integer> numbers, int target, int left, int right) {

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
      return myIndexOf(numbers, target, mid + 1, right);
    } else { // не = и не <
      return myIndexOf(numbers, target, left, mid);
    }
  }
}
