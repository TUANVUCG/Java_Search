package SearchNoUsingRecursive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(10);
        integers.add(12);
        integers.add(-1);
        integers.add(11);
        integers.add(7);
        integers.add(15);
        Collections.sort(integers);
        System.out.println(searchBinary(12,integers));;
    }

    public static boolean searchBinary(int number, List<Integer> integers) {
        int left = 0;
        int right = integers.size() - 1;
        do {
            int mid = (left + right) / 2;
            if (number == integers.get(mid)) {
                return true;
            }
            if (number > integers.get(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } while (left <= right);
        return false;
    }
}
