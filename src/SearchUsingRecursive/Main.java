package SearchUsingRecursive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integersList = new ArrayList<>();
        System.out.print("Nhập số phần tử : ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            integersList.add(sc.nextInt());
        }
        // Sắp xếp mảng
        Collections.sort(integersList);
        for (Integer integer : integersList) {
            System.out.println(integer + "  ");
        }
        System.out.print("Nhập số cần kiểm tra : ");
        int number = sc.nextInt();
        System.out.println(binarySearch(number, 0, integersList.size() - 1, integersList));
    }

    // Hàm binarySearch
    public static boolean binarySearch(int number, int left, int right, List<Integer> integers) {
        int mid = (left + right) / 2;
        if(left>right){
            return false;
        }
        if (number == integers.get(mid)) {
            return true;
        } else if (number > integers.get(mid)) {
            return binarySearch(number, mid + 1, right, integers);
        } else {
            return binarySearch(number, left, mid - 1, integers);
        }
    }

}
